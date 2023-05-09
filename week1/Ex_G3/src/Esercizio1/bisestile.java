package Esercizio1;

public class bisestile {
	public static boolean annoBisestile(int Year) {
	    if (Year % 4 == 0) {
	    	return true;
	}else if(Year % 100 == 0&Year % 400 == 0) {
		return true;
	}else {
		return false;
	}
	}
}
