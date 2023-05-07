package player;

public class audio extends element implements reproduction {
    private int volume;
    private int durata;

    public audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }

    public int getDurata() {
        return durata;
    }


    public void setDurata(int x) {
        this.durata = x;
    }

    public void setVolume(int x) {
        this.volume = x;
    }

    @Override
    public void abbassaVolume() {
        volume--;

    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {

        for (int i = 0; i < getDurata(); i++) {
            System.out.print(getTitolo() + ", volume: ");
            for (int x = 0; x < getVolume(); x++) {
                System.out.print("!");
            }
            System.out.println();
        }
    }
}