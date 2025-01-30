// Write a Java program to find the largest element in an integer array.

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 7, 34, 89, 22}; 

        int max = numbers[0];  

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
