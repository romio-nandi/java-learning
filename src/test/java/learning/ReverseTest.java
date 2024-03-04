package learning;

import junit.framework.TestCase;
import org.junit.Test;

public class ReverseTest extends TestCase {

@Test
    public void testGetReverse() {
        Reverse reverseInstance = new Reverse();
        int k=  reverseInstance.getReverse(786);
        System.out.println("print the Reverse number:"+k);
        assertEquals(687,k);
    }
}