package tdd;

public class AirCondition {

    private boolean isOn;
    private int temperature ;

    public AirCondition() {
         this.isOn = false;
         this.temperature = temperature;
    }


    public boolean isOn() {

        return this.isOn;
    }
    public void turnOn() {
        this.isOn = true;
    }


    public boolean isOff() {
        return !this.isOn;
    }


    public void turnOff() {

        this.isOn = false;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void reduceTemperature() {
        if(this.isOn && this.temperature > 16 ) {

            this.temperature --;
        }
    }

    public int getTemperature() {

        return this.temperature;
    }

    public void increaseTemperature(){
        if(this.isOn && this.temperature < 30) {
            this.temperature ++;
        }
    }
}
