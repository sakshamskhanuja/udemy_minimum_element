import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] enteredIntegers = readIntegers();
        System.out.println("You entered -> " + Arrays.toString(enteredIntegers));

        // Stores the minimum value in enteredIntegers.
        int min = findMin(enteredIntegers);
        System.out.println("Minimum Value = " + min);
    }

    /**
     * Creates an integer array from user input from the console.
     */
    public static int[] readIntegers() {
        // Scans user input.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values = ");

        // Scans the user input -> 1, 2, 3, ...
        String values = scanner.nextLine();
        String[] valuesStringArray = values.split(",");

        // Parses elements of valuesStringArray from String to int.
        int[] valuesArray = new int[valuesStringArray.length];
        for (int i = 0; i < valuesStringArray.length; i++) {
            String element = valuesStringArray[i];
            valuesArray[i] = Integer.parseInt(element.trim());
        }
        return valuesArray;
    }

    /**
     * Finds the minimum value in an integer array.
     */
    public static int findMin(int[] array) {
        // Assumes the first value is the minimum value.
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}