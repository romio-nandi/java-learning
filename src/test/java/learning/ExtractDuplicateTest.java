package learning;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtractDuplicateTest {

    @Test
    public void removeingElement() {
            ExtractDuplicate obj = new ExtractDuplicate();
            int[] arr = {1, 1, 2, 2, 4, 5, 4, 8, 3, 7};
            int[] s = obj.removeingElement(arr);
            System.out.println(Arrays.toString(s));
            int [] expecte={1,2,4};
        Assert.assertArrayEquals(s,expecte);
        }


    }
