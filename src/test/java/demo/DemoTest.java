package demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testMainMethod() {
        // Test that the main method can be called without throwing exceptions
        demo.Test.main(new String[]{});
    }

    @Test
    public void testSimpleAssertion() {
        assertTrue(true);
    }
}