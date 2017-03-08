package org.sinaf.tpFileRouge;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.sinaf.tpFileRouge.dao.pays.PaysDAO;
import org.sinaf.tpFileRouge.dao.pays.impl.PaysDAOImpl;
import org.sinaf.tpFileRouge.dao.salarie.SalarieDao;
import org.sinaf.tpFileRouge.dao.salarie.impl.SalarieDAOImpl;
import org.sinaf.tpFileRouge.service.pays.PaysService;
import org.sinaf.tpFileRouge.service.pays.impl.PaysServiceImpl;

public abstract class APronosticTest {

	// TODO : change PATH /home/mar1/workspace/tpFileRouge/src/test/resources
	// C:/Users/ecole5/workspace/tpFileRouge/src/test/resources
	private static final String PATH = "/home/mar1/workspace/tpFileRouge/src/test/resources";
	private static final String URL = "jdbc:h2:mem:testTpFileRouge;INIT=runscript from '" + PATH
			+ "/Create_Tables.sql'\\;runscript from '" + PATH + "/Insert_data.sql'";

	protected static Connection connection;
	protected PaysDAO paysDao;
	protected SalarieDao salarieDao;
	protected PaysService paysService;
	protected static IDatabaseConnection dbUnitConnection;
	protected static InputStream inputStreamXML;
	protected static FlatXmlDataSetBuilder xmlDSBuilder;
	protected static IDataSet dataSet;

	@BeforeClass
	public static void init()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection(URL, "root", "");
		try {
			dbUnitConnection = new DatabaseConnection(connection);
			inputStreamXML = new FileInputStream(PATH + "/dataset/pronostic_salarie.xml");
			xmlDSBuilder = new FlatXmlDataSetBuilder();
			xmlDSBuilder.setCaseSensitiveTableNames(false);
			dataSet = xmlDSBuilder.build(inputStreamXML);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Before
	public void setUp() {
		this.paysDao = new PaysDAOImpl(connection);
		this.salarieDao = new SalarieDAOImpl(connection);
		this.paysService = new PaysServiceImpl(connection);

	}

	@AfterClass
	public static void tearDown() throws SQLException {
		connection.close();
	}

}
