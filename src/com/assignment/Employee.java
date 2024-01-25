package com.assignment;
public class Employee extends Person {
    private String position;
    private double salary;

    //constructor no-arg
    public Employee(){
        super();
    }

    //constructor 4 parameter
    public Employee(String name,String surname, String position, double salary){
        super(name, surname);
        this.position=position;
        this.salary=salary;
    }

    //getter and setter
    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    //toString
    @Override
    public String toString() {
        return "Employee:" + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    public int compareTo(Employee otherEmployee){
        return Double.compare(this.getPaymentAmount(), otherEmployee.getPaymentAmount());
    }
}
