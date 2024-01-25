package com.assignment;
public abstract class Person implements Comparable<Person> {
    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;

    //constructor no-arg
    public Person(){
        id=id_gen++;
    }

    //constructor with 2 parameter
    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

    //getter and setter
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

    public abstract String getPosition();

    //toString
    @Override
    public String toString() {
        return id + "." + name + " " + surname;
    }

    public double getPaymentAmount() {
        return 0.00;
    }

    public int compareTo(Person otherPerson){
        return Double.compare(this.getPaymentAmount(), otherPerson.getPaymentAmount());
    }
}

