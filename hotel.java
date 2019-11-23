package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

// print statement welcoming user
        System.out.println("Welcome to ParkSide Hotel");

        // getting user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Name: ");

// displaying user input
        String customerName = scan.nextLine();
        System.out.println("Hello " + customerName + "!");

// loop that continuously repeats the same question if user input is less than or equal to 0
        int days;
        do {
            System.out.println("Please Enter the Number of Days You Wish to Stay at ParkSide Hotel: ");
            days = scan.nextInt();
        } while (days <= 0);

// loop that continuously repeats the same question if user input is equal to or greater than 4
        int desiredRoom;
        do {
            System.out.println("Please Choose Your Desired Room Type:  \"1: Standard\", \"2: Deluxe\" or \"3: Suite\"");
            desiredRoom = scan.nextInt();
        } while (desiredRoom >= 4);

// defining variables
        double standard = 125.25;
        double deluxe = 175.50;
        double suite = 225.75;
        double cost = 0;

// allows for numbers to only have two decimal places
        DecimalFormat df = new DecimalFormat(".00");

// conditional statements and math to calculate user input
        switch (desiredRoom) {
            case 1:
                System.out.println("Cost Per Day: $125.25");
                cost = days * standard;
                System.out.println("Total Cost: $" + df.format(cost));
                break;
            case 2:
                System.out.println("Cost Per Day: $175.50");
                cost = days * deluxe;
                System.out.println("Total Cost: $" + df.format(cost));
                break;
            case 3:
                System.out.println("Cost Per Day: $225.75");
                cost = days * suite;
                System.out.println("Total Cost: $" + df.format(cost));
                break;
        }
// defining variables and math to calculate tax amount and total charges
        double taxRate = 0.08;
        double taxAmount = cost * taxRate;

        // displaying number with two place decimal format
        System.out.println("Tax Amount: $" + df.format(taxAmount));

        double totalAmount = cost + taxAmount;
        System.out.println("Total Charges: $" + df.format(totalAmount));

        System.out.println("Thank You For Staying At ParkSide Hotel!");
    }
}
