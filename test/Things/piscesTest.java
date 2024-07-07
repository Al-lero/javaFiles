package Things;

import org.junit.jupiter.api.Test;

public class piscesTest {

    @Test
    public void testPiscesMovement(){
        Pisces fish = new Pisces();
        fish.movement();
        fish.reproduces();
    }
}
