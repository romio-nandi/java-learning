package learning;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindMaxNumberTest {
    FindMaxNumber obj;
    @Before
    public void setup(){
        obj=new FindMaxNumber();

    }

@Test
    public void testMaxNumber() {

        int[] arr = {10,12,13,14,80,56};
        int x=obj.maxNumber(arr);
        System.out.println(x);
        assertEquals(80,x);
    }
}