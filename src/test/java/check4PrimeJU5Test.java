/**
 * Created by sebastianrosenberg on 6/12/17.
 */

//import junit.framework.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;
import  org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class check4PrimeJU5Test {
    //Initialize a class to work with.
    private check4Prime check4prime = new check4Prime();

    @Test
    void standardAssertions() {
        //assertEquals(2, 2);
        //assertEquals(4, 4, "The optional assertion message is now the last parameter.");
        assertTrue(check4prime.primeCheck(11), () -> "Assertion messages can be lazily evaluated -- "
                + "to avoid constructing complex messages unnecessarily.");
    }

    @Test
    public void groupedAssertions() {
        int num1=3;
        int num2=5;
        // In a grouped assertion all assertions are executed, and any
        // failures will be reported together.
        assertAll("num",
                () -> assertTrue(check4prime.primeCheck(num1)),
                () -> assertTrue(check4prime.primeCheck(num2)));


    }

    @Test
    void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("a message");
        });
        assertEquals("a message", exception.getMessage());
    }


}
