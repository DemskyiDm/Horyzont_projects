package lesson22.zad1;

public class Student {

    private StringBuilder name;

    public StringBuilder getName() {
StringBuilder name2 = new StringBuilder(name);
        return name2;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if(course>0 && course<5) {
            this.course = course;
        }
    }

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>0 && grade<11) {
            this.grade = grade;
        }
    }

    public void showInfo() {
        System.out.println("name " + name);
        System.out.println("grade " + grade);
        System.out.println("course "+ course);
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
s.setName(new StringBuilder("Petya"));
s.setGrade(3);
s.setCourse(2);
s.showInfo();
    }
}