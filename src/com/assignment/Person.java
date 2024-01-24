package com.assignment;
public class Person implements Comparable<Person> {
    private static int id_gen=1;
    private int id;
    private String name;
    private String surname;

    public Person(){
        id=id_gen++;
    }

    public Person(String name, String surname){
        this();
        setName(name);
        setSurname(surname);
    }

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

    public String getPosition(){
        return "Student";
    }

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
