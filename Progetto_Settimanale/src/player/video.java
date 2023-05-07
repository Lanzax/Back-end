package player;

public class video extends element implements reproduction, luminosity {
    private int luminosita;
    private int durata;
    private int volume;

    public video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.luminosita = luminosita;
        this.volume = volume;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int x) {
        this.luminosita = x;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        luminosita--;
    }

    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setDurata(int x) {
        this.durata = x;
    }

    public void setVolume(int x) {
        this.volume = x;
    }

    public void abbassaVolume() {
        volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void play() {
        for (int i = 0; i < getDurata(); i++) {
            System.out.print(getTitolo() + ", volume:  ");
            for (int x = 0; x < getVolume(); x++) {
                System.out.print("!");
            }
            System.out.print(" - luminosita: ");
            for (int y = 0; y < luminosita; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
