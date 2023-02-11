package lesson15;

public class HomeWork15 {
    public static void main(String[] args) {

        timming();
    }

    static void timming() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (minute % 10 == 0 && hour > 1) {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }

            }
            while (minute < 59);
            hour++;
        }


    }

}
