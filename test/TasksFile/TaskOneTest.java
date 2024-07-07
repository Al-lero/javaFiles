package TasksFile;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TaskOneTest {
    @Test
    public void test(){
        TaskOne one = new TaskOne();
        int [] numbers = {3,10};
        boolean [] values = one.convert(numbers);
        String result = Arrays.toString(values);
        boolean [] booleanArray = {true, false};
        String actual = Arrays.toString(booleanArray);
        assertEquals(result , actual);
    }



}