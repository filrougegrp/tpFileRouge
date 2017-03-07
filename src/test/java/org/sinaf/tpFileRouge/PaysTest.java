package org.sinaf.tpFileRouge;

import org.junit.Test;
import org.sinaf.tpFileRouge.dao.PaysDAO;
import org.sinaf.tpFileRouge.dao.impl.PaysDAOImpl;
import org.sinaf.tpFileRouge.exception.TechniqueException;

public class PaysTest extends APronosticTest {

	@Test
	public void shouldXXX() {
		PaysDAO paysDAO = new PaysDAOImpl(connection);

		try {
			System.out.println(paysDAO.getById(2L));
		} catch (TechniqueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
