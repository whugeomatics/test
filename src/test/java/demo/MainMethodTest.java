package demo;

import org.junit.Test;

public class MainMethodTest {

    @Test
    public void mainRunsWithoutThrowing() {
        demo.Test.main(new String[0]);
    }
}
