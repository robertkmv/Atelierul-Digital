public class Premiu {
    private String nume;
    private int an;

    public Premiu(String nume, int an) {
        this.nume = nume;
        this.an = an;
    }

    public Premiu() {
        nume = "unknown";
        an = 0000;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }
}
