/**
 * Created by sebastianrosenberg on 6/6/17.
 */

//Imports

import junit.framework.*;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import  org.junit.jupiter.*;

public class check4PrimeTest extends TestCase {
    //Initialize a class to work with.
    private check4Prime check4prime = new check4Prime();

    //constructor
    public check4PrimeTest(String name) {

        super(name);
    }

    //Main entry point
    public static void main(String[] args) {
        System.out.println("Starting test...");
        junit.textui.TestRunner.run(suite());
        System.out.println("Test finished...");
    } // end main()

    //Test case 1
    public void testCheckPrime_true() {
int num = 3;
        //assertTrue(check4prime.primeCheck(3));
        assertTrue(check4prime.primeCheck(num));
        System.out.println("Test 1: el número " + num + " es primo");
    }

    //Test cases 2,3
    public void testCheckPrime_false() {
        assertFalse(check4prime.primeCheck(0));
        assertFalse(check4prime.primeCheck(1000));
    }

    //Test case 7
    public void testCheck4Prime_checkArgs_char_input() {
        try {
            String[] args = new String[1];
            args[0] = "r";
            check4prime.checkArgs(args);
            fail("Should raise an Exception.");
        } catch (Exception success) { //successfull test
        }
    } //end testCheck4Prime_checkArgs_char_input()

    //Test case 5
    public void testCheck4Prime_checkArgs_above_upper_bound() {
        try {
            String[] args = new String[1];
            args[0] = "10001";
            check4prime.checkArgs(args);
            fail("Should raise an Exception.");
        } catch (Exception success) { //successfull test
        }
    } // end testCheck4Prime_checkArgs_upper_bound()

    //Test case 4
    public void testCheck4Prime_checkArgs_neg_input() {
        try {
            String[] args = new String[1];
            args[0] = "-1";
            check4prime.checkArgs(args);
            fail("Should raise an Exception.");
        } catch (Exception success) { //successfull test
        }
    }// end testCheck4Prime_checkArgs_neg_input()

    //Test case 6
    public void testCheck4Prime_checkArgs_2_inputs() {
        try {
            String[] args = new String[2];
            args[0] = "5";
            args[1] = "99";

            check4prime.checkArgs(args);
            fail("Should raise an Exception.");
        } catch (Exception success) {
//successfull test
        }
    } // end testCheck4Prime_checkArgs_2_inputs

    //Test case 8
    public void testCheck4Prime_checkArgs_0_inputs() {
        try {
            String[] args = new String[0];
            check4prime.checkArgs(args);
            fail("Should raise an Exception.");
        } catch (Exception success) { //successfull test
        }
    } // end testCheck4Prime_checkArgs_0_inputs

    //JUnit required method.
    public static Test suite() {
        TestSuite suite = new TestSuite(check4PrimeTest.class);
        return suite;
    }//end suite()
} //end check4PrimeTest
