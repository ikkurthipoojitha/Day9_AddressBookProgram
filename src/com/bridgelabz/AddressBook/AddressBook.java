package com.bridgelabz.AddressBook;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface{
    Scanner s = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<Person>();


    public void operation(ArrayList<Person> arrayRead) {
        // list=AddressManager.listReturn();
        list = arrayRead;
        boolean status = true;
        add();
    }


    public void add() {
        Person person = new Person();
        Address address = new Address();
        System.out.println("Enter the First name:");
        String fname = s.next();
        person.setFname(fname);

        System.out.println("Enter the Last name:");
        String lname = s.next();
        person.setLname(lname);

        System.out.println("Enter the Phone Number:");
        Long phone = s.nextLong();
        person.setPhonenumber(phone);

        System.out.println("Enter the City:");
        String city = s.next();
        address.setCity(city);

        System.out.println("Enter the Zip:");
        long zip = s.nextLong();
        address.setZip(zip);

        System.out.println("Enter the State:");
        String state = s.next();
        address.setState(state);
        person.setAddress(address);
        list.add(person);

    }