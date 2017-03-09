package org.sinaf.tpFileRouge.daoTest.rencontredaotest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.sinaf.tpFileRouge.APronosticTest;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Rencontre;

public class GetRencontreByIdTest extends APronosticTest {

	@Test
	public void shoudlReturnRencontreWhenGetById() throws TechniqueException {
		Optional<Rencontre> rencontre = this.rencontreDAO.getById(2L);
		assertThat(rencontre.isPresent()).isTrue();
	}

	@Test(expected = TechniqueException.class)
	public void shoudlThrowTechniqueException() throws TechniqueException {
		this.rencontreDAO.getById(500L);
	}

}
