package com.assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();


        Employee employee1 = new Employee("Lee", " Dongwook ", "Actor", 100000);
        Employee employee2 = new Employee("Park", " Jimin ", "Idol", 1300000);
        Student student3 = new Student("Balzhan", " Komekbaeva ", 2.89);
        Student student4 = new Student("Gaukhar", " Mazhytkyzy ", 3.67);

        people.add(employee1);
        people.add(employee2);
        people.add(student3);
        people.add(student4);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + "earns " + person.getPaymentAmount() + " tenge");
        }
    }
}

