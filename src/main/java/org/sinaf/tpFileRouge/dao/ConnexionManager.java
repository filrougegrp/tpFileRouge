package org.sinaf.tpFileRouge.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class ConnexionManager {

	private static ConnexionManager connexionManager;
	private BoneCP connectionPool;

	private ConnexionManager() throws IOException, SQLException, PropertyVetoException {
		try {
			// load the database driver (make sure this is in your classpath!)
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		try {
			// setup the connection pool using BoneCP Configuration
			BoneCPConfig config = new BoneCPConfig();
			// jdbc url specific to your database, eg
			// jdbc:mysql://127.0.0.1/yourdb
			config.setJdbcUrl("jdbc:mysql://localhost/pronosticDB");
			config.setUsername("root");
			config.setPassword("Marsql1$@");
			config.setMinConnectionsPerPartition(5);
			config.setMaxConnectionsPerPartition(10);
			config.setPartitionCount(1);
			// setup the connection pool
			this.connectionPool = new BoneCP(config);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

	}

	public static ConnexionManager getInstance() throws IOException, SQLException, PropertyVetoException {
		if (connexionManager == null) {
			connexionManager = new ConnexionManager();
			return connexionManager;
		} else {
			return connexionManager;
		}
	}

	public Connection getConnection() throws SQLException {
		return this.connectionPool.getConnection();
	}

}