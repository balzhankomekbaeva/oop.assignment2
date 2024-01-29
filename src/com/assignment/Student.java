package com.assignment;
public class Student extends Person{
    double gpa;

    //constructor default in subclass Student in which abstract class' constructor is called to set id
    public Student() {
        super();
    }

    //constructor 3 parameters in which abstract class' constructor is called to set name, surname, and mutate gpa
    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa=gpa;
    }

    //getter and setter of attribute gpa
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


    //toString is responsible for display the role of object and other attributes mentioned in abstract class by calling super()
    @Override
    public String toString() {
        return "Student:" + super.toString();
    }

    /*
    @getPayAmount returns constant scholarship or zero by the gpa
    @gpa is an attribute of class Student which is used to allocate scholarship
     */

    @Override
    public double getPaymentAmount() {
        if(gpa>2.67){
            return 36600.00;
        }
        else{
            return 0.00;
        }
    }

    /*
    @getPosition is a method that returns Student instead of job position
     */

    @Override
    public String getPosition() {
        return "Student";
    }

    /*
    @compareTo compares two students by their income
     */
    public int compareTo(Student otherStudent){
        return Double.compare(this.getPaymentAmount(), otherStudent.getPaymentAmount());
    }
}
