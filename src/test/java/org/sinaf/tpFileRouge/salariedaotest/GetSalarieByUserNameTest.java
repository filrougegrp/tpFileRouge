package org.sinaf.tpFileRouge.salariedaotest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.sinaf.tpFileRouge.APronosticTest;
import org.sinaf.tpFileRouge.model.Salarie;

public class GetSalarieByUserNameTest extends APronosticTest {

	@Test
	public void shoudlReturnSalarieWhenGetByName() {
		Optional<Salarie> salarie = this.salarieDao.getSalarieByUsername("marouane");
		assertThat(salarie.get().getUsername()).isEqualTo("marouane");

	}
}
