package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Problem ");
        Scanner sc = new Scanner(System.in);

        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("Enter the choice \n 1.add \n 2.edit \n 3.delete");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter no. of contacts you want to add in list");
                    int choose = sc.nextInt();
                    for (int i = 0; i < choose; i++) {
                        addressBook.addContact();
                    }
                    break;

                case 2:
                    addressBook.editContact();
                    System.out.println("You have Entered following data");
                    System.out.println(addressBook.newPerson);
                    System.out.println("Thank you for using the Address Book");
                    break;

                case 3:
                    addressBook.deleteContact();
                    System.out.println("Address Book details: " + addressBook.newPerson);
                    break;
                default:

                    System.out.println("Enter correct the choice");

            }
        }
    }
}
