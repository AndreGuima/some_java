//package hello;

import org.junit.Test;

import static org.junit.Assert.fail;

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
    public void testWillAlwaysFail() {
        fail("This is An Error");
    }

    @Test
    void testMultiply() {
        assertEquals( "Regular multiplication should work", calculator.multiply(4,5), 20);
    }


}
