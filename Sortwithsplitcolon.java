import java.util.Arrays;
import java.util.Scanner;

public class Sortwithsplitcolon {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner sc = new Scanner(System.in);

        // Read the input string
        String input = sc.nextLine();

        // Split the input string by colon (":") to create a string array
        String[] strarr = input.split(":");

        // Convert the string array to an integer array
        int[] numbers = new int[strarr.length];
        int arrayPosition = 0;

        // Convert each string in the array to an integer and store it in the 'numbers' array
        for (String str : strarr) {
            numbers[arrayPosition++] = Integer.parseInt(str);
        }

        // Sort the integer array
        Arrays.sort(numbers);

        // Print the sorted numbers
        for (int num : numbers) {
            System.out.println(num);
        }

        // Close the scanner
        sc.close();
    }
}
