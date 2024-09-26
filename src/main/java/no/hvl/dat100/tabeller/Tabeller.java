package no.hvl.dat100.tabeller;

import java.util.Collections;

public class Tabeller {

	public static void main(String[] args) {

		// a
		System.out.println("Oppgave a:");
		int[] tabellA = {24, 534, 4, 9};
		skrivUt(tabellA);

		// b
		System.out.println("Oppgave b:");
		int[] tabellB = {13, 3, 8, 4};
		System.out.println(tilStreng(tabellB));

		// c
		System.out.println("\nOppgave c:");
		int[] tabellC = {2, 4, 5, 8};
		System.out.println(summer(tabellC));

		// d
		System.out.println("\nOppgave d:");
		int[] tabellD = {2, 4, 5, 8};
		System.out.println(finnesTall(tabellD, 4));

		// e
		System.out.println("\nOppgave e:");
		int[] tabellE = {2, 4, 5, 8};
		System.out.println(posisjonTall(tabellE, 4));

		// f
		System.out.println("\nOppgave f:");
		int[] tabellF = {6, 4, 5, 8};
		skrivUt(reverser(tabellF));

	}

	// a)
    public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.printf("%d ", tabell[i]);
        }

		System.out.println("\n");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tall = "";
		
		for (int i = 0; i < tabell.length; i++) {
			tall += (i == 0 ? "[" + tabell[i] + ", " : (i != tabell.length - 1 ? tabell[i] + ", " : tabell[i] + "]" ));
		}

		return tall;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int nummer : tabell) {
			sum += nummer;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean iTabell = true;

		for (int nummer : tabell) {
			if (nummer == tall) {
				iTabell = true;
				break;
			} else {
				iTabell = false;
			}
		}

		return iTabell;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int index = 0;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				index = i;
				break;
			} else {
				index = -1;
			}
		}

		return index;
	}

	// f)
    public static int[] reverser(int[] tabell) {
        for (int i = 0; i < tabell.length / 2; i++) {
            int temp = tabell[i];
            tabell[i] = tabell[tabell.length - 1 - i];
            tabell[tabell.length - 1 - i] = temp;
        }

        return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
