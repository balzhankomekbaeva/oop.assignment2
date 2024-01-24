package com.assignment;
public class Student extends Person{
    double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


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

    public int compareTo(Student otherStudent){
        return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
    }
}
