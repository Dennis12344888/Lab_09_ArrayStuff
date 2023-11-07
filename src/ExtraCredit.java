import java.util.Random;
import java.util.Scanner;

public class ExtraCredit {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        Scanner scanner = new Scanner(System.in); // Create a Scanner for input

        int minInline = dataPoints[0];
        int maxInline = dataPoints[0];
        for (int value : dataPoints) {
            if (value < minInline) {
                minInline = value;
            }
            if (value > maxInline) {
                maxInline = value;
            }
        }

        int userValue = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 100:", 1, 100);

        int min = min(dataPoints);
        int max = max(dataPoints);

        System.out.println("Minimum (Inline): " + minInline);
        System.out.println("Minimum (Method): " + min);
        System.out.println("Maximum (Inline): " + maxInline);
        System.out.println("Maximum (Method): " + max);

        int target = SafeInput.getRangedInt(scanner, "Enter a target integer between 1 and 100:", 1, 100);

        int countInline = 0;
        for (int value : dataPoints) {
            if (value == target) {
                countInline++;
            }
        }

        int count = occuranceScan(dataPoints, target);

        System.out.println("Occurrences (Inline): " + countInline);
        System.out.println("Occurrences (Method): " + count);
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int occuranceScan(int[] values, int target) {
        int count = 0;
        for (int value : values) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }
}
