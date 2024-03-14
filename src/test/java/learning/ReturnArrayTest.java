package learning;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReturnArrayTest {

    @Test
    public void arryReturn() {
        ReturnArray obj=new ReturnArray();
        int [] a={10,52,65,60};
        int [] z= obj.arryReturn(a);
        System.out.println(Arrays.toString(z));
        int []exp={60,65,52,10};
        assertArrayEquals(exp,z);
    }
}