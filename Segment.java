
public class Segment {

    private int extr1;
    private int extr2;

    // Constructeur
    public Segment(int extr1, int extr2) {
        this.extr1 = extr1;
        this.extr2 = extr2;
    }


    public int getExtr1() {
        return extr1;
    }

    public int getExtr2() {
        return extr2;
    }


    public void setExtr1(int extr1) {
        this.extr1 = extr1;
    }

    public void setExtr2(int extr2) {
        this.extr2 = extr2;
    }


    public int longueur() {
        return Math.abs(extr2 - extr1);
    }


    public boolean appartient(int x) {
        int min = Math.min(extr1, extr2);
        int max = Math.max(extr1, extr2);
        return (x >= min && x <= max);
    }


    public String toString() {
        return "(" + extr1 + ", " + extr2 + ")";
    }
}