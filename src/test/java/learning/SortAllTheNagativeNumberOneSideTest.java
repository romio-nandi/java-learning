package learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortAllTheNagativeNumberOneSideTest {

    @Test
    public void sortNagative() {
        SortAllTheNagativeNumberOneSide obj=new SortAllTheNagativeNumberOneSide();
        int []arr={-7,-5,5,7,8,-9};
        obj.sortNagative(arr);
         int [] exp={-7,-5,-9,5,7,8};
         assertArrayEquals(exp,arr);


    }

}