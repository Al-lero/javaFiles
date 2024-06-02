package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void testIfBikeIsOn() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testIfBikeIsOff(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();
        assertTrue(bike.isOff);
    }

    @Test
    public void testIfBikeAccelerateOnGearOne(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(15);
        bike.setGear(1);
        bike.accelerate();
        assertEquals(16, bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeAccelerateOnGearTwo(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(24);
        bike.setGear(2);
        bike.accelerate();
        assertEquals(26,bike.getCurrentSpeed());

    }

    @Test
    public void testIfBikeAccelerateOnGearThree(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(35);
        bike.setGear(3);
        bike.accelerate();
        assertEquals(38,bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeAccelerateOnGearFour(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(44);
        bike.setGear(4);
        bike.accelerate();
        assertEquals(48, bike.getCurrentSpeed());

    }

    @Test
    public void testIfBikeDecelerateOnGearOne(){
        AutomaticBike bike =new AutomaticBike();
        bike.setCurrentSpeed(15);
        bike.setGear(1);
        bike.decelerate();
        assertEquals(14,bike.getCurrentSpeed());

    }

    @Test
    public void testIfBikeDecelerateOnGearTwo(){
        AutomaticBike bike =new AutomaticBike();
        bike.setCurrentSpeed(24);
        bike.setGear(2);
        bike.decelerate();
        assertEquals(22,bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeDecelerateOnGearThree(){
        AutomaticBike bike =new AutomaticBike();
        bike.setCurrentSpeed(25);
        bike.setGear(3);
        bike.decelerate();
        assertEquals(22, bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeDecelerateOnGearFour(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(44);
        bike.setGear(4);
        bike.decelerate();
        assertEquals(40, bike.getCurrentSpeed());
    }

    @Test
    public void testBikeAccelerate(){
        AutomaticBike bike = new AutomaticBike();
        bike.accelerate(10);
        assertEquals(10,bike.getSpeed());
    }

    @Test
    public void testBikeDecelerate(){
        AutomaticBike bike = new AutomaticBike();
        bike.decelerate(3);
        assertEquals(-3, bike.getSpeed());

    }

    @Test
    public void testAccelerateBeyondMaximumSpeed(){
        AutomaticBike bike = new AutomaticBike();
        bike.accelerate();
        assertEquals(20, bike.getSpeed());
    }

    @Test
    public void testDecelerateBelowZeroSpeed(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(10);
        bike.setGear(10);
        bike.decelerate();
        assertEquals(0, bike.getSpeed(),"Speed should not go below 0");
    }

    @Test
    public void testAccelerateBetween21and30(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(21);
        bike.setGear(2);
        bike.acceleration();
        assertEquals(21, bike.getCurrentGear());
    }

    @Test
    public void testDecelerateBetweenGear(){
        AutomaticBike bike = new AutomaticBike();
        bike.setCurrentSpeed(30);
        bike.setGear(1);
        bike.decelerate();
        assertEquals(29, bike.getCurrentGear());
    }

    @Test
    public void testGearSpeedBetween41AndAbove(){
        AutomaticBike bike = new AutomaticBike();
        bike.accelerate(50);
        assertEquals(50, bike.getCurrentSpeed());
    }

}
