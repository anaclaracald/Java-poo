import java.util.Scanner;

public class Aluno {
    private String name;
    private double grade1;
    private double grade2;

    public Aluno(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public static Aluno novoAluno(Scanner sc){
        System.out.println("Nome: ");
        String name = sc.nextLine();

        System.out.println("Nota 1: ");
        double grade1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        double grade2 = sc.nextDouble();

        return  new Aluno(name, grade1, grade2);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }
}
