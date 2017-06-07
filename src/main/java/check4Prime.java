/**
 * Created by sebastianrosenberg on 6/6/17.
 */

// Imports

import java.lang.*;

public class check4Prime {
    static final int max = 1000;
    static final int min = 0;
    static int input = 0;

    // Set upper bounds.
// Set lower bounds
// Initialize input variable
    public static void main(String[] args) {
//Initialize class object to work with
        check4Prime check = new check4Prime();
        try {
//Check arguments and assign value to input variable
            check.checkArgs(args);

//Check for Exception and display help
        } catch (Exception e) {
            System.out.println("Usage: check4Prime x");
            System.out.println(" – where 0<=x<=1000");
            System.exit(1);
        }
//Check if input is a prime number
        if (check.primeCheck(input))
            System.out.println("Right... " + input + " is a prime number!");
        else
            System.out.println("Sorry... " + input + " is NOT a prime number!");
    } //End main

    //Calculates prime numbers and compares it to the input
    public boolean primeCheck(int num) {
        double sqroot = Math.sqrt(max); // Find square root of n
//Initialize array to hold prime numbers
        boolean primeBucket[] = new boolean[max + 1];
//Initialize all elements to true, then set non-primes to false
        for (int i = 2; i <= max; i++) {
            primeBucket[i] = true;
        }
//Do all multiples of 2 first
        int j = 2;
        for (int i = j + j; i <= max; i = i + j) {
            primeBucket[i] = false;
        }
        for (j = 3; j <= sqroot; j = j + 2) {
            if (primeBucket[j] == true) {
                for (int i = j + j; i <= max; i = i + j) {
                    primeBucket[i] = false;
                }
            }
        }
//Check input against prime array
        if (primeBucket[num] == true) {
            return true;
        } else {
            return false;
        }
    }//end primeCheck()
//start with 2j as 2 is prime //set all multiples to false
// do up to sqrt of n
// only do if j is a prime
// start with 2j as j is prime // set all multiples to false

    //Method to validate input
    public void checkArgs(String[] args) throws Exception {
//Check arguments for correct number of parameters
        if (args.length != 1) {
            throw new Exception();
        } else {
//Get integer from character
            Integer num = Integer.valueOf(args[0]);
            input = num.intValue();
//If less than zero
            if (input < 0)
                throw new Exception();
            else if (input > max)
                throw new Exception();
        }
    }
}//End check4Prime