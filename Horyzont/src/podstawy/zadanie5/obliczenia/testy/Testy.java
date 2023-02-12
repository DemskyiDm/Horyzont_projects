package podstawy.zadanie5.obliczenia.testy;

import podstawy.zadanie5.obliczenia.Punkt;
import podstawy.zadanie5.obliczenia.Trojkat;

public class Testy {
    public static void main(String[] args) {
        Punkt a = new Punkt(4.0, 4.4);
        Punkt b = new Punkt(6.0, 6.4);
        Punkt c = new Punkt(8.0, 5.0);
        Trojkat t1 = new Trojkat(a,b,c);
        Punkt a1 = new Punkt(4.0, 4.4);
        Punkt b2 = new Punkt(6.0, 6.4);
        Punkt c3 = new Punkt(8.0, 5.0);
        Trojkat t2 = new Trojkat(a1,b2,c3);

        System.out.printf("Odwod trojkata wynosi %.2f%n", t1.obwod());
        System.out.printf("Pole trojkaty wynosi %.2f%n", t1.pole());


        System.out.println("Czy sa take same trojkaty " + t1.equals(t2));
    }
}
