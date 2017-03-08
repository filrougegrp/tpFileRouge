package org.sinaf.tpFileRouge.daoTest.paysdaotest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.sinaf.tpFileRouge.APronosticTest;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pays;

public class UpdatePaysTest extends APronosticTest {

	@Test
	public void shouldUpdatePaysWhenUpdate() {
		Pays pays = new Pays(3L, "Congo", "CLogo");
		try {
			this.paysDao.update(pays);
			assertThat(this.paysDao.getById(3L).get().getNom()).isEqualTo("Congo");
		} catch (TechniqueException e) {
			e.printStackTrace();
		}
	}

}
