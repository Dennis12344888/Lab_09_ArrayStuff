import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int intValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                intValue = pipe.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine(); // Clear the input
            }
        } while (!validInput);
        pipe.nextLine(); // Clear the newline character
        return intValue;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double doubleValue = 0.0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                doubleValue = pipe.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.nextLine(); // Clear the input
            }
        } while (!validInput);
        pipe.nextLine(); // Clear the newline character
        return doubleValue;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int intValue = 0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                intValue = pipe.nextInt();
                if (intValue >= low && intValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input is out of range.");
                    pipe.nextLine(); // Clear the input
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                pipe.nextLine(); // Clear the input
            }
        } while (!validInput);
        pipe.nextLine(); // Clear the newline character
        return intValue;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double doubleValue = 0.0;
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                doubleValue = pipe.nextDouble();
                if (doubleValue >= low && doubleValue <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input is out of range.");
                    pipe.nextLine(); // Clear the input
                }
            } else {
                System.out.println("Invalid input. Please enter a double.");
                pipe.nextLine(); // Clear the input
            }
        } while (!validInput);
        pipe.nextLine(); // Clear the newline character
        return doubleValue;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean validInput = false;
        boolean response = false;
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            String input = pipe.next().toLowerCase();
            if (input.equals("y") || input.equals("n")) {
                validInput = true;
                response = input.equals("y");
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        } while (!validInput);
        pipe.nextLine(); // Clear the newline character
        return response;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        boolean validInput = false;
        do {
            System.out.print("\n" + prompt + ": ");
            input = pipe.nextLine();
            if (input.matches(regEx)) {
                validInput = true;
            } else {
                System.out.println("Input does not match the specified pattern.");
            }
        } while (!validInput);
        return input;
    }

    public static void prettyHeader(String msg) {
        int headerWidth = 60;
        int msgWidth = msg.length();
        int starsWidth = (headerWidth - msgWidth - 4) / 2; // Calculate the number of stars on each side

        StringBuilder header = new StringBuilder(headerWidth);
        header.append("*".repeat(starsWidth)).append(" *** ").append(msg).append(" *** ").append("*".repeat(starsWidth));
        System.out.println(header);
    }

    public static double CtoF(double Celsius) {
        return (Celsius * 9.0 / 5.0) + 32.0;
    }

    public static void main(String[] args) {
        // You can test your methods here
    }


}