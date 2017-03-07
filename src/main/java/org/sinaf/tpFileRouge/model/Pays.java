package org.sinaf.tpFileRouge.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pays {

	private Long id;
	private String nom;
	private String logo;

	@Override
	public String toString() {
		return "Pays [id=" + this.id + ", nom=" + this.nom + ", logo=" + this.logo + "]";
	}

}
