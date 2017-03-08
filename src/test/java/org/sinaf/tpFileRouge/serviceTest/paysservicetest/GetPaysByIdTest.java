package org.sinaf.tpFileRouge.serviceTest.paysservicetest;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.sinaf.tpFileRouge.APronosticTest;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pays;

public class GetPaysByIdTest extends APronosticTest {

	@Test
	public void shoudReturnPaysWhenGetPaysById() throws TechniqueException {
		Optional<Pays> pays = this.paysService.getPaysbyId(2L);
		assertThat(pays.isPresent()).isTrue();
	}

	@Test(expected = TechniqueException.class)
	public void shouldThrowTechnocalException() throws TechniqueException {
		Optional<Pays> togo = this.paysService.getPaysbyId(5000L);
		assertThat(togo.get().getId()).isEqualTo(2L);
	}

}
