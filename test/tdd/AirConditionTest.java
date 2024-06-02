package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {

    private boolean False;

    @Test
    public void testIfAcIsOn() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        assertTrue(ac.isOn());

    }

    @Test
    public void testIfAcIsOff() {
        AirCondition ac = new AirCondition();
        ac.turnOff();
        assertTrue(ac.isOff());
    }




    @Test
    public void testIfAcTemperatureCanReduce(){
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.setTemperature(30);
        ac.reduceTemperature();
        assertEquals(29, ac.getTemperature());
        

    }
    @Test
    public void testIfAcTemperatureCanIncrease() {
        AirCondition ac = new AirCondition();
        ac.turnOn();
        ac.setTemperature(28);
        ac.increaseTemperature();
        assertEquals(29,ac.getTemperature());

    }



}


