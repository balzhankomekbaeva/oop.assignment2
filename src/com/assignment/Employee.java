package com.assignment;
public class Employee extends Person {
    private String position;
    private double salary;

    //constructor default in subclass Employee in which abstract class' constructor is called to set id
    public Employee(){
        super();
    }

    //constructor 4 parameters in which abstract class' constructor is called to set name, surname, and mutate position and  salary
    public Employee(String name,String surname, String position, double salary){
        super(name, surname);
        this.position=position;
        this.salary=salary;
    }

    //getter and setter for each attribute
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


    //toString is responsible for display the role of object and other attributes mentioned in abstract class by calling super()
    @Override
    public String toString() {
        return "Employee:" + super.toString();
    }

    /*
    @getPaymentAmount returns salary as an income of the object in Employee class
     */
    @Override
    public double getPaymentAmount() {
        return salary;
    }

    /*
    @compareTo compares two employees by their salary
     */
    public int compareTo(Employee otherEmployee){
        return Double.compare(this.getPaymentAmount(), otherEmployee.getPaymentAmount());
    }
}
