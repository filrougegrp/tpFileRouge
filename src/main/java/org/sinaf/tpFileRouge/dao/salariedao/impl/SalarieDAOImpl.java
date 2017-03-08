package org.sinaf.tpFileRouge.dao.salariedao.impl;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;

import org.sinaf.tpFileRouge.dao.ConnexionManager;
import org.sinaf.tpFileRouge.dao.salariedao.SalarieDao;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Salarie;

public class SalarieDAOImpl implements SalarieDao {

	private static final String GET_BY_USERNAME_QUERY = "SELECT ID_SALARIE,NOM, PRENOM, USERNAME, PASSWORD FROM SALARIE WHERE SALARIE_ID = ?";

	private Connection con;

	public SalarieDAOImpl() throws TechniqueException {
		try {
			this.con = ConnexionManager.getInstance().getConnection();
		} catch (SQLException | IOException | PropertyVetoException e) {
			e.printStackTrace();
		}
	}

	public SalarieDAOImpl(Connection connection) {
		this.con = connection;
	}

	@Override
	public Optional<Salarie> create(Salarie model) throws TechniqueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Salarie model) throws TechniqueException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Salarie> getById(Long id) throws TechniqueException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Salarie model) throws TechniqueException {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Salarie> getSalarieByUsername(String username) {
		// PreparedStatement preparedStatement;
		// ResultSet rs;
		// Optional<Salarie> salarie = null;
		//
		// if (this.con != null) {
		// try {
		// preparedStatement =
		// this.con.prepareStatement(this.GET_BY_USERNAME_QUERY);
		// //preparedStatement.setLong(1, id);
		// rs = preparedStatement.executeQuery();
		// rs.next();
		// p = new Pays(rs.getLong("ID_PAYS"), rs.getString("NOM"),
		// rs.getString("LOGO"));
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		// }
		//
		// return p;
		return null;

	}

}
