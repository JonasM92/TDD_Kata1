package be.vdab.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeansmits on 08/06/15.
 */
public class CalculatorTest {

    @Test
    public void stringWithoutNumbersReturnsZeroTest() {
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void additionWithOneValueReturnsValueTest() {
        assertEquals(5,Calculator.add("5"));

    }

    @Test
    public void additionWithTwoValuesReturnsSumTest() {
        assertEquals(4,Calculator.add("2,2"));
    }

    @Test
    public void additionWithMultipleValuesReturnsSumTest() {
        assertEquals(55,Calculator.add("1,2,3,4,5,6,7,8,9,10"));
    }

    @Test
    public void getValuesCorrectlyReplacesWhitespaceTest() {
        assertEquals(",,,",Calculator.replaceWhitespace(" \n\t"));
    }

    @Test
    public void stringWithWhitespaceAndNumbersReturnsCorrectSum() {
        assertEquals(15, Calculator.add("1 2\n3\t4,5"));
    }


}
