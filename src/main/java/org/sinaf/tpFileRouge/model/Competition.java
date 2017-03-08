package org.sinaf.tpFileRouge.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Competition {

	private long id;
	private String nom;
	private LocalDate annee;

}
