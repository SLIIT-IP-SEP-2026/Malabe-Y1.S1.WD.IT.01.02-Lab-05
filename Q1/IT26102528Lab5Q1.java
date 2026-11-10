import java.util.Scanner;

public class IT26102528Lab5Q1 {
    public static void main(String[] args) {

        // Create a Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Input the first integer
        System.out.print("Enter the first integer: ");
        int first = input.nextInt();

        // Input the second integer
        System.out.print("Enter the second integer: ");
        int second = input.nextInt();

        // Input the third integer
        System.out.print("Enter the third integer: ");
        int third = input.nextInt();

        // Display all three entered numbers
        System.out.println();
        System.out.println("User entered numbers are : "
                + first + " " + second + " " + third);

        // Assume the first number is the smallest
        int smallest = first;

        // Assume the first number is the largest
        int largest = first;

        // Check whether the second number is smaller
        if (second < smallest) {
            smallest = second;
        }

        // Check whether the third number is smaller
        if (third < smallest) {
            smallest = third;
        }

        // Check whether the second number is larger
        if (second > largest) {
            largest = second;
        }

        // Check whether the third number is larger
        if (third > largest) {
            largest = third;
        }

        // Display the smallest and largest numbers
        System.out.println("The Smallest number is: " + smallest);
        System.out.println("The Largest number is: " + largest);

        // Close the Scanner
        input.close();
    }
}