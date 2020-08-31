package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book programm");
        Scanner scanner= new Scanner(System.in);
        AddressBookImpl addressBook =new AddressBookImpl();
        boolean condition = true;
        while (condition == true)
        {
            System.out.println("1.Add_Person  2.Display_Person  3.Edit_person  4.Delete_Person  5.SortByName_Or_Zip  6.Quit_From_It");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                           addressBook.addMultiplePerson();
                    break;
                    case 2:
                           addressBook.display();
                    break;
                    case 3:
                           System.out.println("Enter person's frist name");
                           String name=scanner.next();
                           addressBook.edit(name);
                    break;
                    case 4:
                          System.out.println("Enter person's name");
                          String firstName=scanner.next();
                          addressBook.deletePerson(firstName);
                          System.out.println("Person's data successfully delete");
                    break;
                    case 5:
                         addressBook.sortByfirstName();
                    case 6:
                         condition = false;
                    break;
            }
        }
    }

}