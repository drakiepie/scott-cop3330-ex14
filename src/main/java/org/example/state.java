package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Exercise 14 Solution
 *  Copyright 2021 Drake Scott
 */

public class state {

    //this method will be executed assuming the user enters the correct state when prompted
    public static String correct(double amount){
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        double tax = amount * 0.055;
        double newAmount = amount + tax;
        String output = "The subtotal is " + df.format(amount) + ".\nThe tax is " + df.format(tax) + ".\n" +
                "The total is " + df.format(amount) + ".";
        return output;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();
        state = state.toLowerCase();

        String output = "";

        if (state.equals("wi")) {
            output = correct(amount);
        }
        else {
            output = "The total is " + df.format(amount) + ".";
        }

        //will print out the correct output for whichever state was entered.
        System.out.println(output);
    }
}
