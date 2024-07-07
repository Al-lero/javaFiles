package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void testBikeIfItCanTurnOn() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOff();
        bike.turnOn();
        assertTrue(bike.isOn);
    }

    @Test
    public void testBikeIfItCanTurnOff() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn);
    }

    @Test
    public void testThatBikeCanAccelerate() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setAcceleration(22);
        assertEquals(22, bike.getAcceleration());
    }

    @Test
    public void testIfBikeCanAccelerateByGear_1() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(15);
        bike.setGear(1);
        bike.accelerate();
        assertEquals(16, bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeCanAccelerateByGear_2() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(22);
        bike.setGear(2);
        bike.accelerate();
        assertEquals(24, bike.getCurrentSpeed());

    }

    @Test
    public void testIfBikeCanAccelerateByGear_3() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(35);
        bike.setGear(3);
        bike.accelerate();
        assertEquals(38, bike.getCurrentSpeed());
    }

    @Test
    public void testIfBikeCanAccelerateByGear_4() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(44);
        bike.setGear(4);
        bike.accelerate();
        assertEquals(48, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByGear_1() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(15);
        bike.setGear(1);
        bike.decelerate();
        assertEquals(14, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByGear_2() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(24);
        bike.setGear(2);
        bike.decelerate();
        assertEquals(22, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByGear_3() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(35);
        bike.setGear(3);
        bike.decelerate();
        assertEquals(32, bike.getCurrentSpeed());
    }

    @Test
    public void testThatBikeCanDecelerateByGear_4() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setCurrentSpeed(44);
        bike.setGear(4);
        bike.decelerate();
        assertEquals(40, bike.getCurrentSpeed());
    }

    @Test
    public void testThatGearSpeedInRangeOf0_20() {
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setAcceleration(19);
        bike.gearSpeed();
        assertEquals(1, bike.getGear());
    }
    @Test
    public void testThatGearSpeedInRange21_20(){
        AutomaticBike bike = new AutomaticBike();
        bike.turnOn();
        bike.setAcceleration(28);
        bike.gearSpeed();
        assertEquals(2,bike.getGear());

    }
}
