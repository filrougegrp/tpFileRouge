package org.sinaf.tpFileRouge.service.pronostic;

import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Pronostic;

public interface PronosticService {

	int create(Pronostic pronostic) throws TechniqueException;

}