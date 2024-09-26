package no.hvl.dat100.tabeller;

public class Tabeller {
	public static void main(String[] args) {
		// a
		System.out.println("Oppgave a:");
		int[] tabellA = {24, 534, 4, 9};
		skrivUt(tabellA);

		// b
		System.out.println("\nOppgave b:");
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
		int[] nyTabell = reverser(tabellF); // kan også bare gjøre skrivUt(reverser(TabellF));, men det ble spesifisert at vi må returnere en *ny* tabell, så gjør det bare sånn
		skrivUt(nyTabell);

		// g
		System.out.println("\nOppgave g:");
		int[] tabellG = {4, 5, 6, 8};
		System.out.println(erSortert(tabellG));

		// h
		System.out.println("\nOppgave h:");
		int[] tabellH1 = {4, 5, 6, 8};
		int[] tabellH2 = {13, 3, 8, 4};
		int[] tabellH = settSammen(tabellH1, tabellH2);
		skrivUt(tabellH);
	}

	// a)
    public static void skrivUt(int[] tabell) {
        for (int i = 0; i < tabell.length; i++) {
            System.out.printf("%d ", tabell[i]);
        }
		System.out.println();
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
		for (int nummer : tabell) {
			if (nummer == tall) {
				return true;
			}
		}

		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}

		return -1;
	}

	// f)
    public static int[] reverser(int[] tabell) { // kunne også brukt en for-loop som lager en ny array med index i som tabell.length - 1 - i, men å bytte om verdiene er mer effektivt fordi vi looper bare halvparten av gangene.
        for (int i = 0; i < tabell.length / 2; i++) {
            int temp = tabell[i];
            tabell[i] = tabell[tabell.length - 1 - i];
            tabell[tabell.length - 1 - i] = temp;
        }
        return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammensattTabell = new int[tabell1.length + tabell2.length];
	
		for (int i = 0; i < tabell1.length; i++) {
			sammensattTabell[i] = tabell1[i];

			for (int j = 0; j < tabell2.length; j++) {
				sammensattTabell[tabell1.length + i] = tabell2[i];
			}
		}
		return sammensattTabell;
	}
}
