package learning;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteValueTest {

    @Test
    public void result() {
        AbsoluteValue obj = new AbsoluteValue();
        int z = obj.result(-8);
        System.out.println(z);
        assertEquals(-8,z);
    }
}