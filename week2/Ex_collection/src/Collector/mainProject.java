package Collector;

import java.util.Set;
import java.util.HashSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class mainProject {
	static Logger log = LoggerFactory.getLogger(mainProject.class);
	static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		setExercise();
		listExercise();
		mapExercise();
	}
	public static void setExercise() {
		Set<String> setParole = new HashSet <String>();
		Set<String> paroleDoppie = new HashSet <String>();
		
		System.out.println("Inserisci il numero degli oggeti che vuoi inserire");
		int num=scanner.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Inserisci l'oggetto");
			String scanWord =scanner.next();
			if(scanWord.contains("0")) {
				i=num+1;
			}else {				
				setParole.add(scanWord);
			}
		}	
		
		for(String doub: setParole){
			if(setParole.contains(doub)) {
				paroleDoppie.add(doub);
			}
		}
		System.out.println("Oggetti");
		System.out.println(setParole);
		System.out.println("La dimensione: "+ setParole.size());
		
		
		System.out.println("Doppie;");
		System.out.println(paroleDoppie);
		
		
		setParole.clear();
		
		
		if(setParole.isEmpty()) {
			System.out.println("è vuoto");
		}
		
	}
	public static void listExercise() {
		
	}
	public static void mapExercise() {
		
	}
}
