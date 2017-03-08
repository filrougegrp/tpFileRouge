package org.sinaf.tpFileRouge;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.sinaf.tpFileRouge.dao.ConnexionManager;

public class DBUnitTest {

	private Connection connection = null;
	private IDatabaseConnection dbUnitConnection;
	private InputStream inputStreamXML;
	private FlatXmlDataSetBuilder xmlDSBuilder;
	private IDataSet dataSet;

	public DBUnitTest() throws Exception {
		try {
			this.connection = ConnexionManager.getInstance().getConnection();

			this.dbUnitConnection = new DatabaseConnection(this.connection);

			this.inputStreamXML = new FileInputStream("pronostic.xml");
			this.xmlDSBuilder = new FlatXmlDataSetBuilder();

			this.xmlDSBuilder.setCaseSensitiveTableNames(false);
			this.dataSet = this.xmlDSBuilder.build(this.inputStreamXML);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertTest() {
		try {
			DatabaseOperation.CLEAN_INSERT.execute(this.dbUnitConnection,
					this.dataSet);
		} catch (DatabaseUnitException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateTest() {
		try {
			DatabaseOperation.UPDATE.execute(this.dbUnitConnection,
					this.dataSet);
		} catch (DatabaseUnitException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteTest() {
		try {
			DatabaseOperation.DELETE.execute(this.dbUnitConnection,
					this.dataSet);
		} catch (DatabaseUnitException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		try {
			DBUnitTest dbUnitTest;
			dbUnitTest = new DBUnitTest();
			dbUnitTest.insertTest();
			// dbUnitTest.updateTest();
			// dbUnitTest.deleteTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
