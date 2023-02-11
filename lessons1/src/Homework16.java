public class Homework16 {
    public static void email(String adres) {
        for (int i = 0; i < adres.length(); i++) {
            if (adres.charAt(i) == '@') {

                if (adres.substring(i + 1).startsWith("yahoo")) {
                    System.out.println("yahoo");
                } else if (adres.substring(i + 1).startsWith("mail")) {
                    System.out.println("mail");
                } else if (adres.substring(i + 1).startsWith("gmail")) {
                    System.out.println("gmail");
                }

            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com");

    }
}
