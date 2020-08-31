package com.bridgelabz.addressbook;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookImpl implements IAddressBook{
    Scanner scanner = new Scanner(System.in);
    List<Person> list = new LinkedList<Person>();

    public void add() {
        System.out.println("enter your first name:");
        String firstName = scanner.nextLine();
        System.out.println("enter your last name:");
        String lastName = scanner.nextLine();
        System.out.println("enter your address");
        String address = scanner.nextLine();
        System.out.println("enter your city");
        String city = scanner.nextLine();
        System.out.println("enter your state");
        String state = scanner.nextLine();
        System.out.println("enter your phone");
        long mobileNo = scanner.nextLong();
        System.out.println("enter your zip code");
        String zip = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, mobileNo, zip);
        list.add(person);
    }

    @Override
    public void edit(String firstName) {
        for (int i = 0; i < list.size(); i++)
        {
            Person person = list.get(i);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
            String address = scanner.nextLine();
            person.setAddress(address);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
            String city = scanner.nextLine();
            person.setCity(city);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
            String state = scanner.nextLine();
            person.setState(state);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
            String zip = scanner.nextLine();
            person.setPincode(zip);

            System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
            int PhoneNo = scanner.nextInt();
            person.setMobileNo(PhoneNo);


            System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
        }
    }
    @Override
    public void deletePerson(String firstName) {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getFirstName().equalsIgnoreCase(firstName))
            {
                Person person = list.get(i);
                list.remove(person);
            }
        }
    }

    @Override
    public void addMultiplePerson() {
        System.out.println("Enter your first name");
        String firstName = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                System.out.println("No duplicate entry acceptable please enter valid name");
                return;
            }
            // System.out.println("enter your first name:");
            //
            // String firstName = scanner.nextLine();
            System.out.println("enter your last name:");
            String lastName = scanner.nextLine();
            System.out.println("enter your address");
            String address = scanner.nextLine();
            System.out.println("enter your city");
            String city = scanner.nextLine();
            System.out.println("enter your state");
            String state = scanner.nextLine();
            System.out.println("enter your phone");
            long mobileNo = scanner.nextLong();
            System.out.println("enter your zip code");
            String zip = scanner.next();

            Person person = new Person(firstName, lastName, address, city, state, mobileNo, zip);
            list.add(person);
        }
    }
}

