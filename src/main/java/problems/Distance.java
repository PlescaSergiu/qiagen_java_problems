package problems;

/*Implement a Java function that finds two neighboring numbers in an array with the
smallest distance to each other. The function should return the index of the first number.
In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2).
The function should return the index 3 (of number 1). */

public class Distance {

    public int minimumDistanceBetweenTwoNumbers(int[] numbers) {
        if (numbers.length <= 0) {
            return -1;
        }
        int initialDistance = Math.abs(numbers[0] - numbers[1]);
        int index = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currenDistance = Math.abs(numbers[i] - numbers[i + 1]);
            if (currenDistance < initialDistance) {
                initialDistance = currenDistance;
                index = i;
            }
        }
        return index;
    }

}
