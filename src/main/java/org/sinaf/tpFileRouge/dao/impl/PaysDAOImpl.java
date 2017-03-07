package org.sinaf.tpFileRouge.dao.impl;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.sinaf.tpFileRouge.dao.ConnexionManager;
import org.sinaf.tpFileRouge.dao.PaysDAO;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pays;

public class PaysDAOImpl implements PaysDAO {

	private Connection con;

	public PaysDAOImpl() throws TechniqueException {
		try {
			this.con = ConnexionManager.getInstance().getConnection();
		} catch (SQLException | IOException | PropertyVetoException e) {
			throw new TechniqueException("hahah", e);
		}
	}

	public PaysDAOImpl(Connection connection) {
		this.con = connection;
	}

	@Override
	public Pays create(Pays model) throws TechniqueException {
		return null;
	}

	@Override
	public void update(Pays model) throws TechniqueException {
		// TODO Auto-generated method stub
	}

	@Override
	public Pays getById(Long id) throws TechniqueException {

		PreparedStatement preparedStatement;
		ResultSet rs;
		Pays p = null;

		try {
			if (this.con != null) {

				String sql = "SELECT * FROM PAYS WHERE ID_PAYS = ?";
				preparedStatement = this.con.prepareStatement(sql);
				preparedStatement.setLong(1, id);
				rs = preparedStatement.executeQuery();

				rs.next();
				p = new Pays(rs.getLong("ID_PAYS"), rs.getString("NOM"), rs.getString("LOGO"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public void delete(Pays model) throws TechniqueException {
		// TODO Auto-generated method stub
	}

}
