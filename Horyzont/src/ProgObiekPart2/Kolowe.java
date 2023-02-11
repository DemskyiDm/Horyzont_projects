package ProgObiekPart2;

public class Kolowe extends Pojazd {
    String rozmiarOpony;
public static void uruchomSilnik(String rodzajSilnika) {
    System.out.println("Uruchomiono silnik " + rodzajSilnika);
}


    Kolowe() {
    }

    Kolowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony) {
    super(rokProdukcji,rodzajSilnika,kolor,masa);
    this.rozmiarOpony = rozmiarOpony;
    }


    public void setRozmiarOpony(String rozmiarOpony) {
        this.rozmiarOpony = rozmiarOpony;
    }

    public String getRozmiarOpony() {
        return rozmiarOpony;
    }
}
