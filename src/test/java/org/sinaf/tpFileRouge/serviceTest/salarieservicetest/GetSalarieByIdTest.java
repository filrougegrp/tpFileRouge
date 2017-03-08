package org.sinaf.tpFileRouge.serviceTest.salarieservicetest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockingDetails;
import org.mockito.MockitoAnnotations;
import org.sinaf.tpFileRouge.APronosticServiceTest;
import org.sinaf.tpFileRouge.dao.salarie.SalarieDao;
import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Salarie;
import org.sinaf.tpFileRouge.service.salarie.SalarieService;
import org.sinaf.tpFileRouge.service.salarie.impl.SalarieServiceImpl;

public class GetSalarieByIdTest extends APronosticServiceTest {

	private SalarieService salarieService;

	@Mock
	private SalarieDao mockSalarieDao;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		salarieService = new SalarieServiceImpl(mockSalarieDao);

	}

	@Test
	public void shoudReturnSalarieWhenGetPaysById() throws TechniqueException {

		doReturn(Optional.ofNullable(new Salarie(3L))).when(mockSalarieDao).getById(3L);

		Salarie salarie = salarieService.getSalariebyId(3L).get();

		assertNotNull(salarie);
		assertEquals(3L, salarie.getId());
		verify(mockSalarieDao, times(1)).getById(3L);
	}

}
