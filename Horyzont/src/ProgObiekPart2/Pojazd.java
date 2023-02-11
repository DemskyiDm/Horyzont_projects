package ProgObiekPart2;

class Pojazd {
    private int rokProdukcji;
    private String rodzajSilnika;
    private String kolor;
    private int masa;

    Pojazd() {
    }

    Pojazd(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    Pojazd(int rokProdukcji, String rodzajSilnika) {
        this(rokProdukcji);
        this.rodzajSilnika = rodzajSilnika;
    }

    Pojazd(int rokProdukcji, String rodzajSilnika, String kolor) {
        this(rokProdukcji, rodzajSilnika);
        this.kolor = kolor;
    }

    Pojazd(int rokProdukcji, String rodzajSilnika, String kolor, int masa) {
        this(rokProdukcji, rodzajSilnika, kolor);
        this.masa = masa;
    }


    public static void uruchomSilnik() {
        System.out.println("Silnik uruchomiono");
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }


    public void setRodzajSilnika(String rodzajSilnika) {
        this.rodzajSilnika = rodzajSilnika;
    }

    public String getRodzajSilnika() {
        return rodzajSilnika;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getKolor() {
        return kolor;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getMasa() {
        return masa;
    }
}
