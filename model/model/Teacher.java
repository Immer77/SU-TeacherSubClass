package model.model;

import java.time.LocalDate;

public class Teacher extends Person{

    private double salary;
    private final LocalDate hiredato;

    public Teacher(String name, String address, String qualification, double salary){
        super(name, address, qualification);
        this.salary = salary;
        hiredato = LocalDate.now();

    }

    @Override
    public void udskrivPerson(){
        super.udskrivPerson();
        System.out.println("Salary: " + salary);
        System.out.print("Yearly salary: ");
        System.out.printf("%.2f\n",yearSalary());
        System.out.println("Ansat: " + getHiredato());

    }

    public double yearSalary(){
        return (salary * 12) * 1.125;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return this.salary;
    }
    public void yearlySalaryIncrease(){
        this.salary *= 1.025;
    }
    public LocalDate getHiredato(){
        return this.hiredato;
    }
}
