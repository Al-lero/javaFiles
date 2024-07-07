package TurtleGraphics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static TurtleGraphics.Direction.*;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {

    @Test
    public void testThatTurtlePenIsUp() {
        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp);

    }

    @Test
    public void testThatTurtlePenIsDown(){
        Turtle turtle =  new Turtle();
        assertTrue(turtle.penIsDown);

    }

    @Test
    public void testThatTurtleCanTurnRight(){
        Turtle turtle =  new Turtle();
        turtle.turnRight();
        assertSame(EAST,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.turnRight();
        assertSame(WEST,turtle.getCurrentDirection());

    }

    @Test
    public void testThatTurtleCanTurnLeftWhileFacingEast(){
        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertSame(WEST,turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(SOUTH,turtle.getCurrentDirection());
        turtle.turnLeft();
        assertSame(EAST,turtle.getCurrentDirection());
    }

   // @Test
    //public void testThatTurtlecanMoveFowardFacingEast(){
      //  Turtle turtle = new Turtle();
        //turtle.moveFoward();
        //assertEquals(EAST,turtle.getCurrentDirection());
        //assertEquals(new Position(0,0),turtle.getCurrentPosition());
        //turtle.moveFoward();
        //assertEquals(new Position(0,4),turtle.getCurrentPosition());

    //}




}
