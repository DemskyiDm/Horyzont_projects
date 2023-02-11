package ProgObiekPart2;

public class Ciezarowka extends Kolowe {
    private int udzwig;

    private static void podniesSkrzynie() {
    }

    Ciezarowka() {
    }
    Ciezarowka(int rokProdukcji, String rodzajSilnika, String kolor, int masa, String rozmiarOpony, int udzwig) {
        super(rokProdukcji,rodzajSilnika,kolor,masa,rozmiarOpony);
        this.udzwig = udzwig;
    }

    public void setUdzwig(int udzwig) {
        this.udzwig = udzwig;
    }

    public int getUdzwig() {
        return udzwig;
    }


}
