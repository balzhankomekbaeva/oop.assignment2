package com.assignment;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        /*
        @people - the name of array list to store data about employees and students
         */


        Employee employee1 = new Employee("Lee", " Dongwook ", "Actor", 100000);
        Employee employee2 = new Employee("Park", " Jimin ", "Idol", 1300000);
        Student student3 = new Student("Balzhan", " Komekbaeva ", 2.89);
        Student student4 = new Student("Gaukhar", " Mazhytkyzy ", 3.67);



        people.add(employee1);
        people.add(employee2);
        people.add(student3);
        people.add(student4);

        /*
        @employee1, employee2, student3. student4 are objects of two different classes,
        we call a  parametrized construction, we call method @add to add people to our array list
        */

        Collections.sort(people);
        /*
        @sort - built-in method that is used to sort people by their income
         */

        printData(people);
        /*
        @printData prints all details about people in database
        @Iterable<Person> people is responsible to accept any collection of Person objects
         */
    }

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString() + "earns " + person.getPaymentAmount() + " tenge");
        }
    }
}

