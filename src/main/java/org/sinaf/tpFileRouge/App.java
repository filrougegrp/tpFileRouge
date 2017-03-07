package org.sinaf.tpFileRouge;

import org.sinaf.tpFileRouge.dao.PaysDAO;
import org.sinaf.tpFileRouge.dao.impl.PaysDAOImpl;
import org.sinaf.tpFileRouge.exception.TechniqueException;

public class App {

	public static void main(String[] args) throws NumberFormatException, TechniqueException {

		PaysDAO paysDAO = new PaysDAOImpl();

		System.out.println(paysDAO.getById(2L));

		// TODO: 1- DbUnit + H2
		// TODO: 1.1- TDD ****
		// TODO: 2- Singleton + booncp
		// TODO: 3- DAO
		// TODO: 4- MVC

	}

}
