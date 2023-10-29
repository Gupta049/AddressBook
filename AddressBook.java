package com.bridgelabz.addressbook;

import java.util.Scanner;

class Contacts{

    String firstName, lastName, Address, city, state, email;
    int zip;
    long phoneNumber;

    public Contacts(String firstName, String lastName, String Address, String city, String state, String email, int zip, long phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.Address = Address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;

    }
    void display(){
        System.out.println("first name : "+ firstName);
        System.out.println("enter last name : " + lastName);
        System.out.println("Enter Address : " + Address);
        System.out.println("enter city : " + city);
        System.out.println("enter state : " + state);
        System.out.println("enter postal code : " + zip);
        System.out.println("enter phone number value : " + phoneNumber);
        System.out.println("enter your email id : " + email);
    }
}
public class AddressBook {

    static void addContacts(Contacts contactArray[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first name : ");
        String firstNameOfPerson = sc.next();
        System.out.print("enter last name : ");
        String lastNameOfPerson = sc.next();
        System.out.print("Enter Address : ");
        String addressOfPerson = sc.next();
        System.out.print("enter city : ");
        String cityOfPerson = sc.next();
        System.out.print("enter state : ");
        String stateOfPerson = sc.next();
        System.out.print("enter postal code : ");
        int zipCode = sc.nextInt();
        System.out.print("enter phone number value : ");
        long mobileNumber = sc.nextLong();
        System.out.print("enter your email id : ");
        String emailIdOfPerson = sc.next();

        contactArray[0] = new Contacts(firstNameOfPerson, lastNameOfPerson, addressOfPerson, cityOfPerson, stateOfPerson, emailIdOfPerson, zipCode, mobileNumber);

    }

    public static void main(String[] args) {

        int temp = 1;
        Contacts contactArray[] = new Contacts[1];
        Scanner sc = new Scanner(System.in);
        while (temp != 0) {
            System.out.print("Enter the Choice value  ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addContacts(contactArray);
                    break;
                case 2:
                    temp = 0;
                    break;
                default:
                    System.out.println("invalid choice");
            }
            contactArray[0].display();
        }
    }
}
