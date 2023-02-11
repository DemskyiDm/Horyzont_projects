package lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("wtornik") {
            case "poniedelnik", "wtornik", "sreda":
            case "chetverg":
            case "piatnica":
                System.out.println("Rabota do 18.00");
                break;

            case "sobota":
                System.out.println("Rabota do 14.00");
                break;
            case "voskrecenie":
                System.out.println("Raboty net");
                break;
            default:
                System.out.println("Takogo dnia nietu");
        }



    }
}
