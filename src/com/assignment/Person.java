package com.assignment;
public abstract class Person implements Comparable<Person> {
    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;

    //constructor default
    public Person(){
        id=id_gen++;
    }

    //constructor with 2 parameter in which we call default constructor to set id
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    //getter and setter for each attribute
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    /*
    @abstract getPosition is used for creating blueprints for the classes Employee and Student
     */
    public abstract String getPosition();

    //@toString method in Person class is used to return main information such as id, name, surname
    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }


    public double getPaymentAmount() {
        return 0.00;
    }

    /*
    @compareTo returns the highest income between two objects
    @otherPerson is an object from class Person that was chosen to compare with certain object
     */
    public int compareTo(Person otherPerson){
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }
}

