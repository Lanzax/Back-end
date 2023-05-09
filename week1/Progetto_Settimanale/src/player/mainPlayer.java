package player;
import java.util.Scanner;
public class mainPlayer {
	static Scanner input = new Scanner(System.in);
    static element[] media = new element[5];

    public static void main(String[] args) {
        creaPlayer();
        playNow();
    }
    
    public static void creaPlayer() {

        for (int i = 0; i < media.length; i++) {
            System.out.println("1 per Immagine, 2 per Video, 3 per Registrazione Audio:");

            int type = input.nextInt();
            input.nextLine();


            switch (type) {
                case 1:
                    System.out.println("Inserisci il titolo:");
                    String titolo = input.nextLine();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita = input.nextInt();
                    media[i] = new Immagine(titolo, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci il titolo:");
                    String titolo2 = input.nextLine();
                    System.out.println("Inserisci la durata:");
                    int durata2 = input.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume2 = input.nextInt();
                    System.out.println("Inserisci la luminosità:");
                    int luminosita2 = input.nextInt();
                    media[i] = new video(titolo2, durata2, volume2, luminosita2);
                    break;
                case 3:
                    System.out.println("Inserisci il titolo:");
                    String titolo3 = input.nextLine();
                    System.out.println("Inserisci la durata:");
                    int durata3 = input.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume3 = input.nextInt();
                    media[i] = new audio(titolo3, durata3, volume3);
                    break;
                default:
                    i--;
                    System.out.println("Errore");
                    break;

            }

        }


    }

    public static void playNow() {
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Riproduci un titolo 1-5");
            scelta = input.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                element el = media[scelta - 1];

                if (el instanceof Immagine) {
                    ((Immagine) el).show();
                } else if (el instanceof reproduction) {
                    ((reproduction) el).play();
                }
            } else {
                System.out.println("Errore");
            }
        }
        input.close();
    }
}
