package learning;

import junit.framework.TestCase;
import org.junit.Test;

public class SumOfArrayTest extends TestCase {


    @Test
    public void testFindSum() {
        SumOfArray sumOfArray = new SumOfArray();
        int[] arr = {12, 15, 14, 17};
        int sum = sumOfArray.findSum(arr);
        assertEquals(58,sum);
    }
}