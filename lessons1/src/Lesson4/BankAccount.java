package Lesson4;

public class BankAccount {

    int id;
    String name;
    double balance;

    void popolnienieScheta (double suma)  {
        balance+=suma;
        // return balance;
    }

    void  snytieScheta (double suma1) {
        balance -= suma1;
        //return balance;
    }
}

class Test1 {
    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.id = 2233;
        bA.name = "retro";
        bA.balance = 100.5;
        bA.popolnienieScheta(200);
        System.out.println(bA.balance);
        bA.snytieScheta(300);
        System.out.println(bA.balance);
    }

}

class Test2 {


        }




