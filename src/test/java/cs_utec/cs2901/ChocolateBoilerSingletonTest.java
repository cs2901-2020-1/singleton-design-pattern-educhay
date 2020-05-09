package cs_utec.cs2901;

import org.junit.Test;
import static org.junit.Assert.*;

public class ChocolateBoilerSingletonTest {
    @Test
    public void test() {
        ChocolateBoilerSingleton cb1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton cb2 = ChocolateBoilerSingleton.getInstance();

        assertEquals(cb1, cb2);
    }
}
