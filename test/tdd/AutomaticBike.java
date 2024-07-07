package tdd;

public class AutomaticBike {
    public boolean isOn;
    private int acceleration;
    private int gear;
    private int deceleration;
    private int currentSpeed;
    private int setGear;
    private int getGearSpeed;
    private int gearSpeed;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAcceleration() {
        return this.acceleration++;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void setGear(int gear) {
        this.setGear = gear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void accelerate() {
        if (setGear == 1) {
            currentSpeed += 1;
        } else if (setGear == 2) {
            currentSpeed += 2;
        } else if (setGear == 3) {
            currentSpeed += 3;
        } else if (setGear == 4) {
            currentSpeed += 4;
        }

    }

    public void decelerate() {
        if (setGear == 1) {
            currentSpeed -= 1;
        } else if (setGear == 2) {
            currentSpeed -= 2;
        } else if (setGear == 3) {
            currentSpeed -= 3;
        } else if (setGear == 4) {
            currentSpeed -= 4;
        }
    }

    public int getGear() {
        return this.gear;
}

    public void gearSpeed() {
        if (this.acceleration >= 0 && this.acceleration <= 20) {
            this.gear = 1;
        } else if (this.gear >= 21 && this.acceleration <= 30) {
            this.gear = 2;
        } else if (this.acceleration >= 31 && this.acceleration <= 40) {
            this.gear = 3;
        } else if (this.acceleration >= 41) {
            this.gear = 4;
        }
    }

    public int getGearSpeed() {
        return this.gearSpeed;
    }
}






