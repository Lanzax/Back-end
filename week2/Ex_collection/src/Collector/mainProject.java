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
		
		System.out.println("Inserisci il numero degli oggeti che vuoi inserire:");
		int num=scanner.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Inserisci l'oggetto (inserire 0 per terminare):");
			String scanWord =scanner.next();
			if(scanWord.contains("0")) {
				i=num+1;
			}else {		
				boolean bool=setParole.add(scanWord);
				if(bool==true) {
					setParole.add(scanWord);
				}else {
					paroleDoppie.add(scanWord);
				}				
			}
		}	
		System.out.println("--------------------------------------");
		System.out.println("Oggetti:");
		for(String arrParole:setParole)
		{
			System.out.println("- "+arrParole);
		}		
		System.out.println("La dimensione: "+ setParole.size());
		
		
		System.out.println("--------------------------------------");

		
		System.out.println("Doppie:");
		for(String arrDoppie:paroleDoppie)
		{
			System.out.println("- "+arrDoppie);
		}	
		System.out.println("La dimensione: "+ paroleDoppie.size());
		
		System.out.println("--------------------------------------");
		
		setParole.clear();
		paroleDoppie.clear();
		
		if(setParole.isEmpty()) {
			System.out.println("Il set oggetti è stato svuotato!");
		}
		if(paroleDoppie.isEmpty()) {
			System.out.println("Il set doppie è stato svuotato!");
		}
		
	}
	public static void listExercise() {
		
	}
	public static void mapExercise() {
		
	}
}
