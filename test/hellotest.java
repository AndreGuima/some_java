//package hello;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class hellotest {

    private Calculator calculator;

    @Before
    void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void testNothing() {
    }

    @Test
    void testMultiply() {
        assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals("Multiple with zero should be zero",0,  calculator.multiply(0,5));
        assertEquals("Multiple with zero should be zero", 0, calculator.multiply(5,0));
    }

}
