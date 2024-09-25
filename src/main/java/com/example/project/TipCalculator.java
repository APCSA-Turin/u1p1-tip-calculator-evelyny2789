package com.example.project;

import java.util.Scanner; 

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();

                     
       
        double tip = (percent/100.0) * cost;
        double billTip = cost + tip; 
        double beforeTip = cost/people; 
        double tipPerson = tip/people; 
        double totalCost = billTip/people; 
        
        
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + (Math.round(cost * 100.0) / 100.0) + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + (Math.round(tip * 100.0) / 100.0) + "\n");        // I learned how to round from here: https://www.educative.io/answers/how-to-use-the-java-mathround-method
        result.append("Total Bill with tip: $" + (Math.round(billTip * 100.0) / 100.0) + "\n");
        result.append("Per person cost before tip: $" + (Math.round(beforeTip * 100.0) / 100.0) + "\n");
        result.append("Tip per person: $" + (Math.round(tipPerson * 100.0) / 100.0) + "\n");
        result.append("Total cost per person: $" + (Math.round(totalCost * 100.0) / 100.0) + "\n");
        result.append("-------------------------------\n");


        return result.toString();
    }

     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;              
        System.out.println(calculateTip(people, percent, cost));

        
    }
}
        
