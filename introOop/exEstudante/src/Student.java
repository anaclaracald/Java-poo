import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public static Student newStudent(Scanner sc){
        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Nota 1: ");
        double grade1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double grade2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        double grade3 = sc.nextDouble();
        return new Student(name, grade1, grade2, grade3);
    }

    public double finalGrade(){
        return grade1+grade2+grade3;
    }

    public double missingPoints() {
        if (finalGrade()< 60.0){
            return 60.0 - finalGrade();
        } else {
            return 0.0;
        }
    }

    public void finalResult (){
        if (finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS\n", this.missingPoints());
        }else {
            System.out.println("PASSED");
        }
    }
}
