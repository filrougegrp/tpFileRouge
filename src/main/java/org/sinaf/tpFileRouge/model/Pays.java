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

	private final Long id;
	private final String nom;
	private final String logo;

	public Pays(Long id, String nom, String logo) {

		this.id = id;
		this.nom = nom;
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Pays [id=" + this.id + ", nom=" + this.nom + ", logo=" + this.logo + "]";
	}

}
