import java.util.Scanner;
import java.util.Random;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        int[] dataPoints = new int[100];
        Random random = new Random();

        // Initialize the dataPoints array with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Display the dataPoints values
        System.out.print("DataPoints values: ");
        for (int value : dataPoints) {
            System.out.print(value + " | ");
        }
        System.out.println();

        // Calculate the sum and average of the values
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f\n", average);

        // Linear scan (search)
        int userValue = SafeInput.getRangedInt(scanner, "Enter a value between 1 and 100: ", 1, 100);

        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The user's value was found " + count + " times in the array.");

        int userValue2 = SafeInput.getRangedInt(scanner, "Enter another value between 1 and 100: ", 1, 100);

        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }

        // Find the minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int value : dataPoints) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        // Calculate and display the average using the getAverage method
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        scanner.close(); // Don't forget to close the scanner when you're done with it
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    // Other methods...

}