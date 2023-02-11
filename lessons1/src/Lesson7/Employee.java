package Lesson7;

public class Employee {
    int id;
    public String surname;
    private double salary;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    public void /*int*/ newId () {

        System.out.println("Nowoje id" + id);

    }

    public String newSurname() {
        surname=surname+"-Vasia";
        System.out.println("Nowoje surname" + surname);
        return surname;
    }

    public double newsalary() {
        salary=salary*2;
        System.out.println("Nowoje salary" + salary);
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(33);
        Employee emp2 = new Employee("Petrov");
        //Employee emp3 = new Employee(44.88);
        emp1.newId();
        System.out.println(emp1.id);
        emp2.newSurname();
        System.out.println(emp2.id);
        emp2.newId();
        emp2.newsalary();






    }
}
