package entities;

import javax.print.attribute.standard.MediaSize;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private Integer ID;

    public Student(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(ID, student.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ID);
    }

    @Override
    public int compareTo(Student other){
        return ID.compareTo(other.getID());
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                '}';
    }
}
