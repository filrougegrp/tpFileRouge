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

	private final String SELECT_QUERY = "SELECT * FROM PAYS WHERE ID_PAYS = ?";
	private final String UPDATE_QUERY = "UPDATE PAYS SET NOM = ?, LOGO = ? WHERE ID_PAYS= ?";

	private Connection con;

	public PaysDAOImpl() throws TechniqueException {
		try {
			this.con = ConnexionManager.getInstance().getConnection();
		} catch (SQLException | IOException | PropertyVetoException e) {
			e.printStackTrace();
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
		PreparedStatement preparedStatement;
		if (this.con != null) {
			try {
				preparedStatement = this.con.prepareStatement(this.UPDATE_QUERY);
				preparedStatement.setString(1, model.getNom());
				preparedStatement.setString(2, model.getLogo());
				preparedStatement.setLong(3, model.getId());
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Pays getById(Long id) throws TechniqueException {

		PreparedStatement preparedStatement;
		ResultSet rs;
		Pays p = null;

		if (this.con != null) {
			try {
				preparedStatement = this.con.prepareStatement(this.SELECT_QUERY);
				preparedStatement.setLong(1, id);
				rs = preparedStatement.executeQuery();
				rs.next();
				p = new Pays(rs.getLong("ID_PAYS"), rs.getString("NOM"), rs.getString("LOGO"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return p;
	}

	@Override
	public void delete(Pays model) throws TechniqueException {
	}

}
