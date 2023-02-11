package ProgObiekPart2;

public class Osobowy extends Kolowe {
    private int iloscOsob;

    Osobowy() {
    }

    Osobowy(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int iloscOsob) {
        super(rokProdukcji, rodzajSilnika, kolor, masa, rozmiarOpony);
        this.iloscOsob = iloscOsob;
    }

    public void setIloscOsob(int iloscOsob) {
        this.iloscOsob = iloscOsob;
    }

    public int getIloscOsob() {
        return iloscOsob;
    }
}
