package org.sinaf.tpFileRouge.app;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConsoleApp {

	private static String nom;
	private static List<String> rencontres = Arrays.asList("match 1", "match 2");

	public static void main(String[] args) {

		getSalarie();

		int selection = -1;

		while (selection != 0) {

			System.out.println("votre nom est : " + nom);
			System.out.println("===== CAN 2016 =====\n\n");

			System.out.println("====== MAIN MENU ======");
			System.out.println("[1] Lister les rencontres");
			System.out.println("[2] voir vos pronostic");
			System.out.println("[0] exit\n\n");

			Scanner s = new Scanner(System.in);

			System.out.println("choisir menu --> ");
			selection = s.nextInt();

			switch (selection) {
			case 1:
				rencontreMenu();
				break;

			case 2:
				System.out.println("Vos pronostic");
				break;

			case 0:
				System.out.println("Fin");
				System.exit(0);
				break;

			default:
				System.out.println("Please enter a valid selection.");

			}

		}

	}

	public static void rencontreMenu() {
		Scanner s = new Scanner(System.in);

		int selection = -1;

		while (selection != 0) {

			ListerRencontres();

			System.out.println("Choisir une rencontre pour saisir des pronostics :");

			selection = s.nextInt();

			switch (selection) {
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

				break;
			}
		}

	}

	private static void getSalarie() {
		Scanner s = new Scanner(System.in);
		System.out.println("svp entrer votre nom");
		nom = s.nextLine();
	}

	private static void ListerRencontres() {
		System.out.println("Les rencontres prochin :");
		int[] idx = { 1 };
		rencontres.forEach(r -> System.out.println("[" + idx[0]++ + "]- " + r));
	}

}
