package be.vdab.calculator;

import be.vdab.calculator.Calculator;
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
    public void additionWithMultipleValuesReturnsSumTest() {
        assertEquals(4,Calculator.add("2,2"));
    }
//
//    @Test
//    public void getValuesCorrectlyRemovesWhitespaceTest() {
//        assertEquals("",Calculator.getValues(" \n\t"));
//    }


}
