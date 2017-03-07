package org.sinaf.tpFileRouge;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class APronosticTest {

	protected static Connection connection;
	private static final String PATH = "/home/mar1/workspace/tpFileRouge/src/test/resources";

	private static final String URL = "jdbc:h2:mem:testTpFileRouge;INIT=runscript from '" + PATH
			+ "/Create_Tables.sql'\\;runscript from '" + PATH + "/Insert_data.sql'";

	@BeforeClass
	public static void init()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("org.h2.Driver");
		connection = DriverManager.getConnection(URL, "root", "");

	}

	@Before
	public void setUp() throws FileNotFoundException, SQLException {
		// File script = new File("V0__Create_Tables.sql");
		// RunScript.execute(this.connection, new FileReader(script));
	}

	@AfterClass
	public static void tearDown() throws SQLException {
		connection.close();
	}

}
