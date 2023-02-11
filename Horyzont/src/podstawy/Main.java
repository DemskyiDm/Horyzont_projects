package podstawy;

class Osoba {
    String imie;
    String nazwisko;
    String telefon;
    int wiek;
    String prezes;

    Osoba(String imie, String nazwisko, String telefon, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
        this.wiek = wiek;
    }
}

public class Main {
    public static void main(String[] args) {
        Osoba czlowiek1 = new Osoba("Anna", "Nowak", "500-123-456", 30);
        czlowiek1.prezes = "Jan Kowalski";
        System.out.println(czlowiek1.prezes);
        Osoba czlowiek2 = new Osoba("Jan", "Wiśniewski", "500-111-222", 20);
        System.out.println(czlowiek2.prezes);
        czlowiek2.prezes = "Beata Polak";
        System.out.println(czlowiek2.prezes);
        System.out.println(czlowiek1.prezes + " " + czlowiek2.prezes);
    }
}
