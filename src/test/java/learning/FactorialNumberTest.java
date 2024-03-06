package learning;

import junit.framework.TestCase;
import org.junit.Test;

public class FactorialNumberTest extends TestCase {
@Test
    public void testReturnFact() {
        FactorialNumber obj = new FactorialNumber();
        int z = obj.returnFact(1);
        System.out.println(z);
        assertEquals(3628800,z);
    }
}