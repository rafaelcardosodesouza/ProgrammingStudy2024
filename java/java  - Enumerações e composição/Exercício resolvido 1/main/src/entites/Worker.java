package entites;

import entites.enus.WokerLevel;

import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
public class Worker {

    private String name;
    private WokerLevel level;
    private Double baseSalary;




    private Department department;
    private List<HourContract> contracts = new ArrayList<>();


    public Worker(){

    }
    public Worker(String name, WokerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WokerLevel getLevel() {
        return level;
    }

    public void setLevel(WokerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public Double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();

        for(HourContract x : contracts){
            cal.setTime(x.getData());

            int x_year = cal.get(Calendar.YEAR);
            int x_month = cal.get(Calendar.MONTH) +1;
            if(x_month == month && x_year == year){
                sum += x.totalValue();
            }
        }
        return sum;
    }
}