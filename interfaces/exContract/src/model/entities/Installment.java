package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    public static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Installment(){
    }

    public Installment(Double amount, LocalDate dueDate) {
        this.amount = amount;
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Due date: " + dueDate.format(sdf) +
                "\nAmount: " + String.format("%.2f",amount) +"\n";
    }
}
