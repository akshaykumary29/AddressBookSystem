package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact newPerson = new Contact();

    List contactList = new ArrayList();



    public void addContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lastname = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter City: ");
        String city = sc.nextLine();
        System.out.println("Enter State: ");
        String state = sc.nextLine();
        System.out.println("Enter Zip Code: ");
        int zipcode = sc.nextInt();
        System.out.println("Enter Phone Number: ");
        int phoneNumber = sc.nextInt();
        System.out.println("Enter Email Id: ");
        String email = sc.next();

        newPerson.setFirstName(firstName);
        newPerson.setLastName(lastname);
        newPerson.setAddress(address);
        newPerson.setCity(city);
        newPerson.setState(state);
        newPerson.setZipCode(zipcode);
        newPerson.setPhoneNumber(phoneNumber);
        newPerson.setEmail(email);

        contactList.add(newPerson);

        System.out.println("details of " + firstName + "\n" + newPerson);
    }

    public void editContact() {
        System.out.println("Enter the FirstName of person");
        String editName = sc.nextLine();
        for (int i = 0; i < contactList.size(); i++) {
            if (editName.equalsIgnoreCase(newPerson.getFirstName()))
                addContact();
            else
                System.out.println("The Entered First Name Is Not Match");
            editContact();
        }
    }

    public void deleteContact() {
        System.out.println("Enter firstName of the person");
        String deleteContact = sc.nextLine();

        for (int i = 0; i < contactList.size(); i++) {
            if (deleteContact.equals(newPerson.getFirstName())) {
                System.out.println("Deleted " + newPerson.getFirstName() + "details");
                newPerson = null;
            }
        }
    }
}
