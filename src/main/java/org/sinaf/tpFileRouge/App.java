package org.sinaf.tpFileRouge;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Random rn = new Random();

		for (int i = 1; i <= 24; i++) {
			System.out.println("INSERT INTO `PRONOSTIC` (`BUT_1`, `BUT_2`, `NOTE`, `ID_MATCH`, `ID_SALARIE`) VALUES ('"
					+ rn.nextInt(6 - 0 + 1) + "', '" + rn.nextInt(6 - 0 + 1) + "', '0', '" + i + "', '1');");
		}
	}
}
