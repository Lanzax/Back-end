package Esercizio3;

public class whileCondition {
	public static String divisionWord(String parola) {
		do{
			if(parola.contains("q")) {
				String[] caratteri=parola.split("");	
				return String.join(",", caratteri);
			}else {
				return "Inserisci altro";
			}
		}while (parola.contains("q"));
	}
}