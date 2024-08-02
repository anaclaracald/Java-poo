package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client: ");
        sb.append("\nName='").append(name).append('\'');
        sb.append("Email=").append(email).append('\'');
        sb.append("BirthDate=").append(sdf.format(birthDate));
        return sb.toString();
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
