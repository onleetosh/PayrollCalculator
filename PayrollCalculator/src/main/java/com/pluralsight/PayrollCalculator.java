package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = input.nextLine();

        System.out.println("Enter your work hours:");
        double workHours = input.nextFloat();

        System.out.println("Enter your pay rate:");
        double payRate = input.nextFloat();

        double grossPay =  payRate * workHours;
        System.out.println(userName + "your gross rate: " + grossPay);

    }
}
