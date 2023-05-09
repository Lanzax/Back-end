package it.epicode.be;

public class Helloworld {

public static void main (String[] args)
		{
		System.out.println("This is my first Epicode Java Project!");
		int a=10;
		int b=2;
		int moltiplicazione =moltiplicazione(a,b);
		System.out.println("La moltiplicazione fra i due numeri: "+ moltiplicazione);
		String messaggio ="ciao";
		int numero=45;
		String concatena= concatena(messaggio,numero);
		System.out.println("Il messaggio concatenato: "+concatena);
		String[] nuovoArray = inserisciInArray(new String[]{"A", "B","C", "D", "E"},"X");
		System.out.println("Terzo elemento array di arrivo: " + nuovoArray[2]);

		}
public static int moltiplicazione(int a, int b) {
	return a*b;
}
public static String concatena(String stringa, int numero) {
	return stringa+numero;
}
public static String[] inserisciInArray(String[] inputArray, String stringa) {
	

	String[] risultato = new String[6];


	
	risultato[0] = inputArray[0];
	risultato[1] = inputArray[1];
	risultato[2] = stringa;
	risultato[3] = inputArray[2];
	risultato[4] = inputArray[3];
	risultato[5] = inputArray[4];	


	return risultato;
}
}



