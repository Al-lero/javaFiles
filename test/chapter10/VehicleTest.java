package chapter10;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testVehicle(){
        Vehicle motor = new Vehicle() {
            @Override
            public void move() {
                System.out.println("moving");
            }
        };
    }
}
