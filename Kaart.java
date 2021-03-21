public class Kaart {

    private int väärtus;
    private final String kirjeldus;

    public Kaart(int väärtus, String kirjeldus) {
        this.väärtus = väärtus;
        this.kirjeldus = kirjeldus;
    }

    public String getKirjeldus() {
        return kirjeldus;
    }

    public int getVäärtus() {
        return väärtus;
    }

    public void setVäärtus(int väärtus) {
        this.väärtus = väärtus;
    }

    @Override
    public String toString() {
        return "Kaart Kirjeldus: " + kirjeldus + ", Väärtus: " + väärtus;
    }

}
