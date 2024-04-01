package org.launchcode;

import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of miles you have driven: ");
        double numOfMiles = input.nextDouble();

        System.out.println("Please enter the amount of gas you have used in gallons: ");
        double numGasInGallons = input.nextDouble();

        double milesPerGallon = numOfMiles / numGasInGallons;
        System.out.println("You are running on " + milesPerGallon + " mpg!");
    }
}
