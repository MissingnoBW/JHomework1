package app.service;

import java.util.Scanner;

public class Calculator {

    int first, second;

    public Calculator(){

    }

    public int getSum(){
        return first + second;
    }

    public int getDif(){
        return first - second;
    }

    public int getMulti(){
        return first * second;
    }

    public float getDiv(){
        return (float) first / second;
    }

    public void printResult(int sum, int dif, int multi, double div){
        System.out.printf(
                "Sum: %d\n" +
                "Difference: %d\n" +
                "Multiplication: %d\n" +
                "Division: %.2f\n",
                sum, dif, multi, div);
    }

    public void readInput(){
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter two numbers: ");
            try {
                first = Integer.parseInt(input.next()); // Parsing to catch possible exceptions
                second = Integer.parseInt(input.next());
            } catch (java.lang.NumberFormatException nfe) { // If read something besides integer values
                System.out.println("Input is not correct, try again");
                input.nextLine(); // *Flushing* remaining input to prevent error message duplication
                continue; // Trying again
            }
            break;
        } while (true); // Cycle ends only with break
    }

}
