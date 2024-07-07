package tdd;

public class Television {
    private boolean isOn;
    private boolean isOff;
    private Object currentMenu;
    private int volumeLevel;
    private Object brightnessLevel;
    private Object language;
    private Object contrastLevel;


    public void turnOn() {
        this.isOn = true;
    }

    public boolean isOn() {
       return this.isOn;
    }

    public void turnOff() {
        this.isOff = true;
    }

    public boolean isOff() {
        return this.isOff;
    }


    public void navigateMenu(String settings) {
        currentMenu = settings;
    }

    public String getCurrentMenu() {
        return (String) currentMenu;
    }

    public void increaseVolume() {
        if(isOn && volumeLevel > 0){
            volumeLevel++;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void decreaseVolume() {
        if(isOn ) {
            volumeLevel--;
        }
    }

    public void setBrightness(int level) {
        brightnessLevel = level;
    }

    public int getBrightnessLevel() {
        return (int) brightnessLevel;
    }

    public void setLangauge(String english) {
        language = english;
    }

    public String getLanguage() {
        return (String) language;
    }

    public void setContrast(int i) {
        contrastLevel = i;
    }

    public int getContrastLevel() {
        return (int) contrastLevel;
    }




}
