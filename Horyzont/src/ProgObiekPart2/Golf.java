package ProgObiekPart2;

public class Golf extends VW {
    Golf(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony,iloscOsob);
    }

    public static void main(String[] args) {


    Golf G1 = new Golf(2019, "elektryczny", "bialy", 1200, "195/70 R15", 4);
    Golf G2 = new Golf(2012, "benzynowy", "czerwony", 1500, "185/70 R16", 5);
    Golf G3 = new Golf(2009, "diesel", "niebieski", 1800, "195/80 R17", 5);

    }

}
