package ProgObiekPart2;

public class Gasienicowe extends Pojazd {
    int moc;

    public static final void uruchomSilnik() {
        Pojazd.uruchomSilnik();
        System.out.println("Jest to pojazd gąsienicowy");

    }

    Gasienicowe() {
    }

    Gasienicowe(int rokProdukcji, String rodzajSilnika, String kolor, int masa, int moc) {
        super(rokProdukcji, rodzajSilnika, kolor, masa);
        this.moc = moc;
    }


    public void setMoc(int moc) {
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }
}
