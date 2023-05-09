
public class Rettangolo {

    public static void main(String[] args) {
       
        int b = 10;
        int h = 25;
        int b1 = 4;
        int h1 = 6;
        int b2 = 22;
        int h2 = 4;
        int[] risultato = StampaRettangolo(b, h);
        System.out.println("Area: " + risultato[0]);
        System.out.println("Perimetro: " + risultato[1]);   
        int[] risultatoTrttangoli=StampaDueRettangoli ( b1,  h1,  b2, h2 );
        System.out.println("Rettangolo 1:");
        System.out.println("Perimetro: " + risultatoTrttangoli[0]);  
        System.out.println("Area: " + risultatoTrttangoli[1]);
        System.out.println("Rettangolo 2:");
        System.out.println("Perimetro: " + risultatoTrttangoli[2]);  
        System.out.println("Area: " + risultatoTrttangoli[3]);
        int perimetroSommato= risultatoTrttangoli[0]+risultatoTrttangoli[2];
        int areaSommata= risultatoTrttangoli[1]+risultatoTrttangoli[3];
        System.out.println("Perimetro sommato: "+perimetroSommato +", "+"Area Sommata: "+areaSommata );
    }

    public static int calcolaArea (int b, int h) {
        return (b * h);
    }

    public static int calcolaPermimetro (int b, int h) {
        return (b * 2) + (h * 2);
    }

    public static int[] StampaRettangolo (int b, int h ) {    	
        		int perimetro= calcolaPermimetro(b, h);
        		int area= calcolaArea(b, h);  
        		int[] valori={area,perimetro};
        		return valori;       		
    } 
    public static int[] StampaDueRettangoli (int b1, int h1, int b2, int h2 ) {    	
    	int area1=(b1 * h1);
    	int area2=(b2 * h2);
    	int perimetro1=(b1 * 2) + (h1 * 2);
    	int perimetro2=(b2 * 2) + (h2 * 2);
    	int[] valori={area1,area2,perimetro1,perimetro2};
    	return valori;
} 
}