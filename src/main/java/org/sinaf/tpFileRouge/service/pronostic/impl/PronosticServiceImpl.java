package org.sinaf.tpFileRouge.service.pronostic.impl;

import java.sql.Connection;

import org.sinaf.tpFileRouge.dao.pronostic.PronosticDAO;
import org.sinaf.tpFileRouge.dao.pronostic.impl.PronosticDAOImpl;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pronostic;
import org.sinaf.tpFileRouge.service.pronostic.PronosticService;

public class PronosticServiceImpl implements PronosticService {

	private final PronosticDAO pronosticDao;

	public PronosticServiceImpl() {
		this.pronosticDao = new PronosticDAOImpl();
	}

	public PronosticServiceImpl(Connection connection) {
		this.pronosticDao = new PronosticDAOImpl(connection);
	}

	@Override
	public int create(Pronostic pronostic) throws TechniqueException {
		return this.pronosticDao.create(pronostic);
	}

}
