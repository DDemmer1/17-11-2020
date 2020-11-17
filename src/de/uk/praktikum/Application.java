package de.uk.praktikum;

public class Application {

	public static void main(String[] args) {
		
			
				//############################################
					
				double preis = 1.99d;
			
				//wandelt den Preis in einen abgerundeten int wert um
				int abgerundeterPreis = (int) preis;
				
				
				//weist der Variablen "istAbgerundet" das Ergebnis des Vergleichs zwischen "abgerundeterPreis" und 1 zu
				boolean istAbgerundet = abgerundeterPreis == 1;
				
				
				System.out.println("Preis abgerundet: " + istAbgerundet);
				
				//############################################
				
				char c = 'A';
				
				
				//wandelt den char c in seinen ASCII Wert um
//				int ii = c;
				//oder
				int ii = (int) c;
				
				System.out.println(ii);
				
				
				
				//############################################

				
				//Überlegt euch warum man keinen String zu einem char casten kann
				String s = "A";
			
//				char gehtNicht = (char) s;
				
//				String ist ein Komplexer Datentyp und kann nicht zu einem primitiven Datentyp gecastet werden
				
				//############################################
				
				
				//Die String Klasse hat Methoden
				char buchstabe = s.charAt(4);
				
				System.out.println(buchstabe);


	}

}
