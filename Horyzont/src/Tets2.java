import java.util.ArrayList;
import java.util.List;

public class Tets2 {
    public static void main(String[] args) {
        List<String> listaKobiet = new ArrayList<>();
        listaKobiet.add("Mietek");
        listaKobiet.add("Karolina");
        listaKobiet.add("Matylda");
        listaKobiet.add("Zosia");
        listaKobiet.add("Joasia");
        listaKobiet.add("Mira");
        listaKobiet.add("Majka");
        listaKobiet.add("Malwina");
        listaKobiet.add("Józef");

        System.out.println("Wiele operacji jednocześnie:Sortowanie, filtrowanie, mapowanie");
        listaKobiet.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> !s.endsWith("A"))
                .sorted()
                .forEach(s->System.out.println(s+" Pana dzisiaj nie powinno tutaj być !"));
    }
}
