package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;

public class state {

    //this method will be executed assuming the user enters the correct state when prompted
    public static double correct(double amount){
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        double tax = amount * 0.055;
        System.out.println("The subtotal is " + df.format(amount) + ".\nThe tax is " + df.format(tax) + ".");
        double newAmount = amount + tax;
        return newAmount;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,##0.00");

        System.out.print("What is the order amount? ");
        double amount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();
        state = state.toLowerCase();

        if (state.equals("wi")) {
            amount = correct(amount);
        }
        //will print out the correct total whichever state was entered.
        System.out.println("The total is " + df.format(amount) + ".");
    }
}
