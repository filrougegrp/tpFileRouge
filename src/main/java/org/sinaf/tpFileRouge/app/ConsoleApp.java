package org.sinaf.tpFileRouge.app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {

	private static String nom;
	private static List<String> rencontres;
	private static List<String> pronostic;

	public static void main(String[] args) {

		rencontres = Arrays.asList("match 1", "match 2");

		while (true) {

			Scanner s = new Scanner(System.in);

			System.out.println("svp entrer votre nom");
			nom = s.nextLine();

			System.out.println("votre nom est : " + nom);
			System.out.println("===== CAN 2016 =====\n");

			System.out.println("MAIN MENU : ");
			System.out.println("[1] Lister les rencontres");
			System.out.println("[2] voir vos pronostic");
			System.out.println("[3] exit\n\n");

			System.out.println("----> ");
			int selection = s.nextInt();

			switch (selection) {
			case 1:
				ListerRencontres();

				System.out.println("Choisir Un Match Pour saisir les pronostics :");

				int ss = s.nextInt();
				switch (ss) {
				case 1:
					System.out.println("but_1 :");
					int b1 = s.nextInt();

					System.out.println("but_2 :");
					int b2 = s.nextInt();

					System.out.println("but_1 : " + b1 + "  but_2 : " + b2);
					break;
				case 2:

					break;
				case 0:
					System.out.println("Les rencontres prochin :");
					break;
				}
				break;

			case 2:
				System.out.println("Vos pronostic");
				break;

			case 3:
				System.out.println("Fin");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter a valid selection.");

			}

		}

	}

	private static void ListerRencontres() {
		System.out.println("Les rencontres prochin :");
		int[] idx = { 1 };
		rencontres.forEach(r -> System.out.println("[" + idx[0]++ + "]- " + r));
	}

}
