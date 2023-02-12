package podstawy.zadanie5.obliczenia;

public class Odcinek {

    private static Punkt p1;
    private static Punkt p2;

    public Odcinek(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;
        if (dlugosc(p1,p2) == 0)
            throw new IllegalArgumentException("odcinek nie moze miec zerowej dlugosci");
    }


    public static double dlugosc(Punkt p1, Punkt p2) {
        return Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
    }

}
