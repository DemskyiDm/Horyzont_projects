package lesson14;

public class HomeWork14 {
    public static void main(String[] args) {

        timming();
    }

    static void timming() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {
                if (minute % 10 == 0 && hour > 1) {
                    break OUTER;
                }
                INNER_1:
                for (int second = 0; second <= 59; second++) {
                    if (second * hour > minute) {
                        continue;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }

    }
}

