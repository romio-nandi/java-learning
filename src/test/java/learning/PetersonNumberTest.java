package learning;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PetersonNumberTest {

    @Test
    public void isPeterson() {
        PetersonNumber petersonNumber = new PetersonNumber();
        boolean peterson = petersonNumber.isPeterson(145);
        assertTrue(peterson);
    }

}