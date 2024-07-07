package TasksFile;

public class TaskOne {

    public static boolean[] convert(int[] numbers) {

        boolean[] array = new boolean[numbers.length];

        for (int counter = 0; counter < numbers.length; counter++ ) {
            if (numbers[counter] % 2 == 0) {
                array[counter] = false;
            } else {
                array[counter] = true;
            }
        }
        return array;
    }


}