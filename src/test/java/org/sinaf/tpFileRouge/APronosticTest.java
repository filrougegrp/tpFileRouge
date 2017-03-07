package org.sinaf.tpFileRouge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.sinaf.tpFileRouge.dao.PaysDAO;
import org.sinaf.tpFileRouge.dao.impl.PaysDAOImpl;

public abstract class APronosticTest {

	private static final String PATH = "/home/mar1/workspace/tpFileRouge/src/test/resources";
	private static final String URL = "jdbc:h2:mem:testTpFileRouge;INIT=runscript from '" + PATH
			+ "/Create_Tables.sql'\\;runscript from '" + PATH + "/Insert_data.sql'";

	protected static Connection connection;
	protected PaysDAO paysDao;

	@BeforeClass
	public static void init()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection(URL, "root", "");

	}

	@Before
	public void setUp() {
		this.paysDao = new PaysDAOImpl(connection);
	}

	@AfterClass
	public static void tearDown() throws SQLException {
		connection.close();
	}

}
