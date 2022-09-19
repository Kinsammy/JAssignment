package chapter2Test;

import Chapter2.ArithmeticThreeInt;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class ArithmeticThreeIntTest {

    @Test
    void testThatObjectExist() {
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertNotNull(number);
    }

    @Test
    void sumOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(30,number.sum(15,10,5));
    }

    @Test
    void averageOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(10,number.average(15,10,5));
    }


    @Test
    void productOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(60,number.product(3,10,2));
    }


    @Test
    void smallestOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(5,number.smallest(15,10,5));
    }

    @Test
    void largellestOfThreeInteger(){
        ArithmeticThreeInt number = new ArithmeticThreeInt();
        assertEquals(15,number.largest(15,10,5));
    }
}
