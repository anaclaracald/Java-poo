package entities;

import enumsEntities.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", departament=" + departament +
                ", contracts=" + contracts +
                '}';
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //functions
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(Integer year, Integer month){
        double sum = baseSalary;  // adding the base salary to the sum
        Calendar calendar = Calendar.getInstance(); //calling the class to manipulate dates
        for (HourContract contract : contracts){ // for each contract in contracts
            calendar.setTime(contract.getDate()); // take the atual date of the contract been analized
            int contractYear = calendar.get(Calendar.YEAR);
            int contractMonth = 1 + calendar.get(Calendar.MONTH); // get the month
            if(year == contractYear && month == contractMonth){ //compare if the instance passed is the same of each contract
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
