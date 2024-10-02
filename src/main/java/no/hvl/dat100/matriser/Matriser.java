package no.hvl.dat100.matriser;

public class Matriser {
	public static void main(String[] args) {

		// a
		System.out.println("Oppgave a:");
		int[][] matrise = { { 1, 3, 5, 7, 9 }, { 2, 4, 6, 8, 10 }, { 7, 8, 9, 8, 10 }, { 2, 4, 6, 8, 10 }, };
		skrivUt(matrise);

		// b
		System.out.println("\nOppgave b:");
		int[][] matriseB = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.print(tilStreng(matriseB));

		// c
		System.out.println("\nOppgave c:");
		int[][] matriseC = { { 24, 3, 7 }, { 4, 5, 11 }, { 6, 2, 1 } };
		int multiplikator = 10;
		skrivUt(skaler(multiplikator, matriseC));

		// d
		System.out.println("\nOppgave d:");
		int[][] matriseD1 = { { 24, 3, 7 }, { 4, 5, 11 }, { 6, 2, 1 } };
		int[][] matriseD2 = { { 24, 3, 7 }, { 4, 5, 11 }, { 6, 2, 1 } };
		System.out.print(erLik(matriseD1, matriseD2));

		// e
		System.out.println("\n\nOppgave e:");
		int[][] matriseE = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		skrivUt(speile(matriseE)); // {{1,4,7}, {2,5,8}, {3,6,9}}

		// f
		System.out.println("\nOppgave f:");
		int[][] a = { {1, 3, 5, 7}, {2, 4, 6, 8}, {10, 11, 12, 13} };
		int[][] b = { {1, 6, 2, 4}, {2, 3, 8, 4}, {3, 7, 5, 6} };

		skrivUt(multipliser(a, b));
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		// Lag en matrise og skriv ut ved hjelp av to nøstede utvidede for-løkker
		for (int[] rad : matrise) {
			for (int liste : rad) {
				System.out.print(liste + " "); // Skriver listene
			}
			System.out.println(); // Lager ny linje pr. liste
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		// Metoden skal returnere en String versjon av matrisen
		String altPåLinje = "";

		for (int[] rad : matrise) {
			for (int liste : rad) {
				String nummerTilStreng = Integer.toString(liste);
				altPåLinje += nummerTilStreng + " ";
			}
			altPåLinje += "\n";
		}

		return altPåLinje;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		// Metoden skal returnere en matrise der alle tall er ganget med parameteren
		// tall
		// matrise.length - antall rader
		// matrise[0].length - antall kolonner
		int[][] sum = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				sum[i][j] = matrise[i][j] * tall;
			}
		}
		return sum;
	}

	// d)
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		// Metoden skal sjekke om to matriser er identisk, returner true hvis de er like
		// og false om ikke
		if (mat1.length != mat2.length) {
			return false;
		}

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				if (mat1[i].length != mat2[i].length) {
					return false;
				}

				if (mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

    // e
    public static int[][] speile(int[][] matrise) {
        int[][] speiletMatrise = new int[matrise[0].length][matrise.length]; 

        for (int i = 0; i < matrise.length; i++) {
            // 1 4 7
            // 2 5 8
            // 3 6 9
            // [1 0 0]
            // [0 ]
            
            for (int j = 0; j < matrise[0].length; j++) {
                // System.out.printf("(kolonne %d, rekke %d) = (kolonne %d, rekke %d)\n", j, i, i, j);
                speiletMatrise[j][i] = matrise[i][j];
            }
        }

        return speiletMatrise;
    }

	// f)

	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] ny = new int[4][3];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				for (int r = 0; r < ny.length; r++) {
					ny[i][j] += a[i][r] * b[r][j];
				}
			}
		}

		return ny;
	}
}
