package lesson13;

public class Month {
    public static void main(String[] args) {
        int numberOfMonth = 2 ;
        switch (numberOfMonth) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Ilosc dni - 31");
                break;
            case 2:
                System.out.println("ilosc dni 28");
                break;
            case 4, 6, 9, 11:
                System.out.println("Ilość dni 30");
                break;
        }
    }
}
