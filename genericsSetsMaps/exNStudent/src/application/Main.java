package application;

import entities.Student;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Student> set = new TreeSet<>();

        System.out.print("How many students for course A? ");
        int nCourseA = sc.nextInt();

        for (int i=0;i<nCourseA;i++){
            System.out.print("Student ID: ");
            int ID = sc.nextInt();

            set.add(new Student(ID));
        }

        System.out.print("How many students for course B? ");
        int nCourseB = sc.nextInt();

        for (int i=0;i<nCourseB;i++){
            System.out.print("Student ID: ");
            int ID = sc.nextInt();

            set.add(new Student(ID));
        }

        System.out.print("How many students for course C? ");
        int nCourseC = sc.nextInt();

        for (int i=0;i<nCourseC;i++){
            System.out.print("Student ID: ");
            int ID = sc.nextInt();

            set.add(new Student(ID));
        }

        System.out.println("Total students: "+ set.size());

        sc.close();
    }

}