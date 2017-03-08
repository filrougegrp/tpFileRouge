package org.sinaf.tpFileRouge.app;

import java.util.List;
import java.util.Scanner;

import org.sinaf.tpFileRouge.exception.TechniqueException;
import org.sinaf.tpFileRouge.model.Rencontre;
import org.sinaf.tpFileRouge.model.Salarie;
import org.sinaf.tpFileRouge.service.rencontre.RencontreService;
import org.sinaf.tpFileRouge.service.rencontre.impl.RencontreServiceImpl;
import org.sinaf.tpFileRouge.service.salarie.SalarieService;
import org.sinaf.tpFileRouge.service.salarie.impl.SalarieServiceImpl;

public class ConsoleApp {

	private static SalarieService salarieService = new SalarieServiceImpl();
	private static RencontreService rencontreService = new RencontreServiceImpl();

	private static List<Rencontre> rencontres;

	private static Salarie salarie;

	public static void main(String[] args) throws TechniqueException {

		getSalarie();

		int selection = -1;

		while (selection != 0) {

			System.out.println("votre nom est : " + salarie.getNom());
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

	public static void rencontreMenu() throws TechniqueException {
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

	private static void getSalarie() throws TechniqueException {
		Scanner s = new Scanner(System.in);
		System.out.println("svp entrer votre nom");

		String nom = s.nextLine();

		salarie = salarieService.getSalariebyUsername(nom).get();

	}

	private static void ListerRencontres() throws TechniqueException {
		System.out.println("Les rencontres prochin :");
		int[] idx = { 1 };

		rencontres = rencontreService.getAll();
		rencontres.forEach(r -> System.out
				.println("[" + r.getId() + "]- " + r.getPays_1().getNom() + "  VS" + " " + r.getPays_2().getNom()));
	}

}
