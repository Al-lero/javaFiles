package tdd;

public class AutomaticBike {
    public boolean isOff;
    private boolean isOn;
    private int speed;
    private int gear;
    private int currentSpeed;
    private int maximumSpeed;
    ;;


    public boolean isOn() {
        return this.isOn;
    }

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOff = true;
    }

    public void setCurrentSpeed(int speed) {
        this.currentSpeed = speed;
    }

    public void setGear(int gear) {
        this.gear = gear;

    }

    public void accelerate() {
        if(gear == 1) {
             currentSpeed += 1;
        }
        if (gear == 2) {
            currentSpeed +=2;
        }
        else if (gear == 3) {
            currentSpeed += 3;
        }
        else {
            currentSpeed += 4;
        }
    }


    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void decelerate() {
        if (gear == 1) {
            currentSpeed -= 1;
        }
        if (gear == 2) {
            currentSpeed -= 2;
        }

         if (gear == 3) {
                currentSpeed -= 3;
            }
         else if (gear == 4) {
             currentSpeed -= 4;
           }
        }

    public int getSpeed() {
        return speed;

    }

    public AutomaticBike(){
        this.speed = 0;
    }


    public void changeGear(int gear) {
        int currentGear = Math.max(0, Math.min(gear, 30));

    }

    public int getCurrentGear() {
        return currentSpeed;
    }


    public void acceleration() {
        if(gear == 6)
            currentSpeed += 6;
    }

    public int accelerate(int i) {
        speed += i;
        speed = Math.min(speed, maximumSpeed);
        return i;
    }

    public void decelerate(int i) {
        speed -= i;
        currentSpeed = 0;
    }
}












