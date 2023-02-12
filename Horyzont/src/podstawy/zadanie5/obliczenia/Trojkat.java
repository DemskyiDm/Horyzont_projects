package podstawy.zadanie5.obliczenia;

import static podstawy.zadanie5.obliczenia.Odcinek.dlugosc;

public class Trojkat {
    private Punkt a, b, c;

    public Trojkat(Punkt a, Punkt b, Punkt c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a == b && b == c)
            throw new IllegalArgumentException("trojkat nie mozna utworzyc z podanych punktow");
        if (pole() == 0)
            throw new IllegalArgumentException("trojkat nie moze miec zerowego pola");
    }


    double dlugosc_tr(Punkt a, Punkt b) {
        return Odcinek.dlugosc(a, b);
    }

    public double obwod() {
        return dlugosc(a, b) + dlugosc(a, c) + dlugosc(b, c);
    }

    public double pole() {
        return Math.sqrt((obwod() / 2) * ((obwod() - dlugosc_tr(a,b)) / 2) * ((obwod() - dlugosc_tr(a, c)) / 2) * ((obwod() - dlugosc_tr(b, c)) / 2));
    }

   @Override
    public boolean equals(Object ob) {
        Trojkat tr = (Trojkat) ob;

       double[] arr1 = {dlugosc_tr(a, b), dlugosc_tr(a, c), dlugosc_tr(b, c)};
        double[] arr2 = {tr.dlugosc_tr(a, b), tr.dlugosc_tr(a, c), tr.dlugosc_tr(b, c)};
       return arr1[0]==arr2[0]&&arr1[1]==arr2[1]&&arr1[2]==arr2[2];
   }


}
