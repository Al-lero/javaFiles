package TurtleGraphics;

import static TurtleGraphics.Direction.*;

public class Turtle {

    public boolean penIsUp = true;
    public boolean penIsDown = true;
    private Direction currentDirection = NORTH;
    private Direction turnLeftCurrenTDirection = EAST;



    public void PenIsUp() {
    }

    public void turnRight() {
        if(currentDirection == SOUTH) currentDirection = WEST;
        if(currentDirection == EAST) currentDirection = SOUTH;
        if(currentDirection == NORTH) currentDirection = EAST;

    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        if(currentDirection == SOUTH) currentDirection = EAST;
        if(currentDirection == WEST) currentDirection = SOUTH;
        if(currentDirection == NORTH) currentDirection = WEST;


    }

    public void moveFoward() {
    }

    public short getCurrentPosition() {
        return 0;

    }
}
