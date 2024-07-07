package Interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    private List myList;

    @BeforeEach
    void setUp(){
        myList = new List();
    }

    @Test
    void testAddTo(){
        myList.addTo("Apple");
        assertEquals(1,myList.getSize());
    }

    @Test
    void testRemoveFrom(){
        myList.addTo("Apple");
        myList.removeFrom("Apple");
        assertEquals(0,myList.getSize());
    }

    @Test
    void testAddTwoApples(){
        myList.addTo("Pineapple");
        myList.addTo("Orangeapple");
        assertEquals(2, myList.getSize());
    }

    @Test
    void testThatListCanExpand(){
        myList.addTo("Apple");
        myList.addTo("PineApple");
        myList.addTo("OrangeApple");
        assertEquals(3,myList.getSize());
    }

    @Test
    void testThatListCanRemoveOne(){
        myList.addTo("Apple");
        myList.addTo("PineApple");
        myList.addTo("OrangeApple");
        myList.removeFrom("Apple");
        assertEquals(2,myList.getSize());
    }

}