package no.hvl.dat100.lab6.matriser;

import java.util.Arrays;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO Skriv ut matrise med nøstede utvidete løkker 
		for (int [] rad: matrise){
			System.out.println();
			for(int kolonne: rad) 
				System.out.print(kolonne);
			System.out.println();
		}
//		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}
	// b)
	public static String tilStreng(int[][] matrise) {

		// TODO returnerer en streng representasjon av matrisen
		
		String matriseTxt="";

		for (int [] rad: matrise){
			matriseTxt= matriseTxt + "\n"; // går ned et hakk før den begynner?
			for(int kolonne: rad) {
					matriseTxt= matriseTxt + " " + kolonne; 
		}
		
		
		}
		return matriseTxt;
	}	
		
//		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO ny matrise, gange innholdet med tall
		
		int [][] nyMatrise = new int [matrise.length][matrise.length];
		
		
		
		
		for (int i=0;i<matrise.length;i++) {
			nyMatrise[i]= new int [matrise.length]; 
			for (int j=0; j<matrise[i].length;j++) { 
				nyMatrise[i][j]=matrise[i][j]*tall;
			}
		}
		return nyMatrise;
		
	}
		
				
		
			
			
		
		
		
//		throw new UnsupportedOperationException("skaler ikke implementert");
	
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO avgjør om to tabeller er lik gitt ved parameter a og b
		
		boolean lik=false;
		
			if (Arrays.equals(a,b)){
				lik = true;
			}
		
		return lik;
	}	
//		throw new UnsupportedOperationException("erLik ikke implementert");
	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO speile en kvadratisk matrise om hoveddiagonalen, må lage en ny matrise som skal speiles
		
		int[][] speil = new int [matrise.length][matrise.length];
		
// Løkken skal ta tallet på som står på den bakerste kolonnen og flytte det til den første raden, tallet på rad 0, skal på kolonne 0
//	så på neste rad skal vi ta tallene fra den nest bakerste kolonnen og plassere de i den samme rekkefølge, sånn går det til det er ferdig
		
//	
		for (int i=0; i<matrise.length;i++){

			for (int j=0; j<matrise[i].length;j++){
				speil[i][j]=speil[i+1][matrise[i].length]; 
					if (i > 0) 
						speil[i][j]=speil[i+1][matrise[i].length]-1;
			}
				
				
			}
		return speil;
		}
		
	
	
				
				
				//		throw new UnsupportedOperationException("speile ikke implementert");
	
	

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO multiplikasjon av matriser
//		Tviler på at man bare kan skrive matrise * matrise....
		
		int [][]stormatrise = new int [a.length][b.length];
		
		
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
	
}

