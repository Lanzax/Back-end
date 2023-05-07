package player;

abstract public class element {
    private String titolo;

    public element(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String y) {
        this.titolo = y ;
    }
}
