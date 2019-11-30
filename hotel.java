package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

// creating instances
public class Hotel {
    String name;
    double desiredRoom;
    int days;
    double taxRate = 0.08;
    double taxAmount;
    double total;

    // creating a constructor
    Hotel(String nameInput, double desiredRoomInput, int daysInput) {
        this.name = nameInput;
        this.desiredRoom = desiredRoomInput;
        this.days = daysInput;

// using conditional if statements to define user choice
        if (desiredRoomInput == 1) {
            desiredRoom = 125.25;
        }
        if (desiredRoomInput == 2) {
            desiredRoom = 175.50;
        }
        if (desiredRoomInput == 3) {
            desiredRoom = 175.25;
        }
    }

    // creating a method to do calculations
    double CalculateCharges() {
        DecimalFormat df = new DecimalFormat(".00");
        double cost;
        cost = desiredRoom * days;
        taxAmount = cost * taxRate;
        total = cost + taxAmount;
        System.out.println("Cost: $" + df.format(cost));
        System.out.println("Tax Amount: $" + df.format(taxAmount));
        return total;
    }

    public static void main(String[] args) {

        // scanner to get user input
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to ParkSide Hotel!");

        System.out.println("Please Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println("Hi " + name + ", Welcome!");

        System.out.println("Please Choose Your Desired Room Type: 1: Standard, 2: Deluxe, 3: Suite");
        int desiredRoom = scan.nextInt();

        System.out.println("Please Enter the Number of Days You Wish to Stay at ParkSide Hotel: ");
        int days = scan.nextInt();

        Hotel c1 = new Hotel(name, desiredRoom, days);

//calling method
        System.out.println("Total Charges: $" + c1.CalculateCharges());
        System.out.println("Thank You For Staying At ParkSide Hotel!");

    }
}
