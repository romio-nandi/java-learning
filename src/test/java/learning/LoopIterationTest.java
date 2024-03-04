package learning;

import junit.framework.TestCase;
import org.junit.Test;

public class LoopIterationTest extends TestCase {
@Test
    public void testGetIteration() {
        LoopIteration obj = new LoopIteration();
        int k = obj.getIteration(1);
        System.out.println(k);
        assertEquals(5,k);
    }
}