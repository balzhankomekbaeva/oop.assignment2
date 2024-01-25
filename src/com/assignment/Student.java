package com.assignment;
public class Student extends Person{
    double gpa;

    //constructor no-arg
    public Student() {
        super();
    }

    //constructor 3 parameter
    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa=gpa;
    }

    //getter and setter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    //toString
    @Override
    public String toString() {
        return "Student:" + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        if(gpa>2.67){
            return 36600.00;
        }
        else{
            return 0.00;
        }
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    public int compareTo(Student otherStudent){
        return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
    }
}
