package org.sinaf.tpFileRouge.service.pays.impl;

import java.sql.Connection;
import java.util.Optional;

import org.sinaf.tpFileRouge.dao.pays.PaysDAO;
import org.sinaf.tpFileRouge.dao.pays.impl.PaysDAOImpl;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pays;
import org.sinaf.tpFileRouge.service.pays.PaysService;

public class PaysServiceImpl implements PaysService {

	private final PaysDAO paysDao;

	public PaysServiceImpl() throws TechniqueException {
		this.paysDao = new PaysDAOImpl();
	}

	public PaysServiceImpl(Connection connection) {
		this.paysDao = new PaysDAOImpl(connection);
	}

	@Override
	public Optional<Pays> getPaysbyId(Long id) throws TechniqueException {
		return this.paysDao.getById(id);
	}

	@Override
	public void updatePays(Pays pays) throws TechniqueException {
		this.paysDao.update(pays);
	}

}
