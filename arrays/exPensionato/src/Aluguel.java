import java.util.Scanner;

public class Aluguel {
    private String name;
    private String email;
    private Integer room;

    public Aluguel(String name, String email, Integer room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString() {
        return "\nQuarto " + room +
                "\nNome: " + name +
                "\nEmail: " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
