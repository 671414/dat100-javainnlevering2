package no.hvl.dat100.lab5.tabeller;



public class Tabeller {
	
	



	// a)
	public static void skrivUt(int[] tabell) {

		// TODO implementer metode som skriver ut tabell med heltall 
	
		System.out.print("");
			for (int i =0; i<tabell.length; i++) {
				System.out.println(i);
			}
		
		
		
//		throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		// TODO returnere en tekstreng som innehodler innholdet i en tabell 
		
		String tabellTxt="[]";
		for(int i=0;i <= tabell.length-1;i++) {
		if ( i == 0 ) {
				tabellTxt = "["+ tabell[i];
				if(tabell.length==1) {
					tabellTxt =tabellTxt +"]";
				}
		}else if(i == tabell.length-1) {
				tabellTxt =  tabellTxt + "," + tabell[i] + "]";
		}else if (i == tabell.length) {
		
		}else  {
				tabellTxt = tabellTxt + "," + tabell[i];
		
				
		}
		
		}
		return tabellTxt;
//		Vet ikke hvorfor den sier expected [1] men får [1, hvor faen kommer det fra når det andre er fikset
	
//		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}	
	

	// c 1
	public static int summer(int[] tabell) {

		// TODO Tre metoder som regner sammen summen av tabeller, en for løkke, en while løkke og en utvidet for løkke
		
		int sum=0;
		for (int i =0; i<tabell.length; i++) {
			sum+=tabell[i];
		}
//		System.out.println(sum);
	return sum;
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

// c 2 
	public static int summer1(int[] tabell) {
		int y=0;
		int sum2=0;
		while (y<tabell.length) {
			 sum2+=tabell[y];
			y++;
		}
//		System.out.println(sum2);
return sum2;
		
//	throw new UnsupportedOperationException("summer ikke implementert");
	}	
	
// c 3
	public static int summer2(int[] tabell) {
		int sum3=0;
		for(int nr: tabell) {
			sum3+=nr;
		}
//		System.out.println(sum3);
		
return sum3;
	}



	// d) Sekvensielt søk, returner true om tallet er i tabellen, hvis ikke false.
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet=false;
		int i=0;
		while (!funnet && i<tabell.length) {
			if (tabell[i] == tall)
				funnet=true;
			else
				i++;
		}
	return funnet;
	
//	throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO returnerer første indeksposisjon som innehodler tallet tall, hvis ikke -1
		
		int i=0;
		int svar = -1;
		
		while (i<tabell.length) {
			if (tabell[i] == tall) {
			 svar=i;
			}
		i++;
		}	
		return svar;

//		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO returner en tabell med heltall med de samme tallene som tabellen som ble satt inn, men i motsatt rekkefølge
//		helpetabell for å reverse 
		int[] nyTabell = new int [tabell.length]; 
		int j=tabell.length;
		for (int i=0; i<tabell.length ; i++) {
			nyTabell[j-1]=tabell[i];
			j=j-1;
		}
		return nyTabell;
		}
		
//throw new UnsupportedOperationException("reverser ikke implementert");
		
	

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO avgjør om tabellen er sortert stigende
		
	boolean sortert=true;
	int i=1;
	while(sortert && i<tabell.length) {
		if (tabell[i-1]<=tabell[i])
			i++;
		
		else 
		sortert=false;
	}
		return sortert;
	
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int [nyLengde];
		for (int i =0;i<tabell1.length;i++) {
			nyTabell[i]=tabell1[i];
		}
		for (int j=0;j<tabell2.length;j++) {
			nyTabell[tabell1.length+j]=tabell2[j];
		}
		return nyTabell;
//		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
