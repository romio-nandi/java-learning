package learning;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AutomorphicNumberTest {

    AutomorphicNumber automorphicNumber;

    @Before
    public void setup() {
        automorphicNumber = new AutomorphicNumber();
    }

    @Test
    public void testCheckAutomorphicNumber() {
        boolean result = automorphicNumber.checkAutomorphicNumber(25);
        assertTrue(result);
    }

    @Test
    public void testNegative() {
        boolean result = automorphicNumber.checkAutomorphicNumber(9);
        assertFalse(result);
    }

    @Test
    public void testPositive() {
        assertTrue(automorphicNumber.checkAutomorphicNumber(5));
    }

}