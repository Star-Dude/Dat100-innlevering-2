package no.hvl.dat100.matriser;

public class Matriser {

    public static void main(String[] args) {

        // a
        System.out.println("Oppgave a:");

        int[][] matrise
                = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}, {1, 3, 5, 7, 9}, {2, 4, 6, 8, 10},};
        skrivUt(matrise);

        // b
        System.out.println("\nOppgave b:");
        int[][] matriseB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        tilStreng(matriseB);

        // c
        System.out.println("\n\nOppgave c:");
        int[][] matriseC = {{24, 3, 7}, {4, 5, 11}, {6, 2, 1}};
        int multiplikator = 10;
        skrivUt(skaler(multiplikator, matriseC));

        // d
        System.out.println("\nOppgave d:");
        int[][] matriseD1 = {{24, 3, 7}, {4, 5, 11}, {6, 2, 1}};
        int[][] matriseD2 = {{24, 3, 7}, {4, 5, 11}, {6, 2, 1}};
        System.out.print(erLik(matriseD1, matriseD2));
    }

    // a)
    public static void skrivUt(int[][] matrise) {
        // Lag en matrise og skriv ut ved hjelp av to nøstede utvidede for-løkker
        for (int[] rad : matrise) {
            for (int liste : rad) {
                System.out.print(liste + " "); // Skriver listene 
            }
            System.out.println();  // Lager ny linje pr. liste
        }
    }

    // b)
    public static void tilStreng(int[][] matrise) {
        // Metoden skal returnere en String versjon av matrisen
        for (int[] rad : matrise) {
            for (int liste : rad) {
                String altPåLinje = Integer.toString(liste);
                System.out.printf("%s ", altPåLinje);
            }
            System.out.print("\\n");
        }
    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {
        // Metoden skal returnere en matrise der alle tall er ganget med parameteren tall
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
        // Metoden skal sjekke om to matriser er identisk, returner true hvis de er like og false om ikke 
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

    // e)
    public static int[][] speile(int[][] matrise) {

        // TODO
        throw new UnsupportedOperationException("Metoden speile ikke implementert");

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        // TODO
        throw new UnsupportedOperationException("Metoden multipliser ikke implementert");

    }
}
