package podstawy.zadanie5.obliczenia;

public class Punkt {
    private double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

   public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return String.format("%.1f, %.1f", x, y);
    }

    public void przesun(Wektor v) {
        x = x + v.dx;
        y = y+ v.dy;
    }


}
