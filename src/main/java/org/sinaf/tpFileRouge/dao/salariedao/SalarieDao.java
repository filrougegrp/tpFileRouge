package org.sinaf.tpFileRouge.dao.salariedao;

import java.util.Optional;

import org.sinaf.tpFileRouge.dao.IDAO;
import org.sinaf.tpFileRouge.model.Salarie;

public interface SalarieDao extends IDAO<Salarie> {

	Optional<Salarie> getSalarieByUsername(String username);
}
