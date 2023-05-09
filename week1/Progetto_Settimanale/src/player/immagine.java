package player;

class Immagine extends element implements luminosity {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
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

    public void show() {
        System.out.print(getTitolo() + ", luminosità: ");
        for (int i = 0; i < getLuminosita(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
