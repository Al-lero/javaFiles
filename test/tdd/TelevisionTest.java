package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TelevisionTest {
    @Test
    public void testIfTvIsOn(){
        Television tv = new Television();
        tv.turnOn();
        assertTrue(tv.isOn());

    }

    @Test
    public void testIfTvIsOff(){
        Television tv = new Television();
        tv.turnOff();
        assertTrue(tv.isOff());

    }

    @Test
    public void testIfTvNavigateMenuSetting(){
        Television tv = new Television();
        tv.isOn();
        tv.navigateMenu("settings");
        assertEquals("settings",tv.getCurrentMenu());
    }

    @Test
    public void testIfTvVolumeIsIncreasing(){
        Television tv = new Television();
        tv.isOn();
        tv.increaseVolume();
        assertEquals(0, tv.getVolumeLevel());

    }

    @Test
    public void testIfTvVolumeIsDecreasing() {
        Television tv = new Television();
        tv.isOn();
        tv.decreaseVolume();
        assertEquals(0,tv.getVolumeLevel());

    }

    @Test
    public void testIfTvCanFunctionInAnyEnviroment(){
        Television tv = new Television();
        tv.isOn();

    }

    @Test
    public void testIfTvSettingsCanBeAdjusted(){
        Television tv = new Television();
        tv.isOn();
        tv.setBrightness(50);
        assertEquals(50, tv.getBrightnessLevel());

    }

    @Test
    public void testIfTvLangauageCanBeAdjusted(){
        Television tv = new Television();
        tv.isOn();
        tv.setLangauge("English");
        assertEquals("English", tv.getLanguage());
    }

    @Test
    public void testIfTvColorContrastCanBeset(){
        Television tv = new Television();
        tv.isOn();
        tv.setContrast(20);
        assertEquals(20, tv.getContrastLevel());
    }


}
