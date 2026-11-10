import java.util.Scanner;

public class IT26102528Lab5Q2 {
    public static void main(String[] args) {

        // Create a Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number of new members
        System.out.print("Enter the number of new members introduced: ");
        int members = input.nextInt();

        // Validate that the number is not negative
        if (members < 0) {
            System.out.println("Input must be a number 0 or greater.");
        } else {

            // Use a switch statement to select the prize
            switch (members) {

                case 0:
                    // No new members introduced
                    System.out.println("No Prize");
                    break;

                case 1:
                    // One new member introduced
                    System.out.println("Prize is a : Pen");
                    break;

                case 2:
                    // Two new members introduced
                    System.out.println("Prize is a : Umbrella");
                    break;

                case 3:
                    // Three new members introduced
                    System.out.println("Prize is a : Bag");
                    break;

                case 4:
                    // Four new members introduced
                    System.out.println("Prize is a : Travelling Chair");
                    break;

                default:
                    // Five or more new members introduced
                    System.out.println("Prize is a : Headphone");
            }
        }

        // Close the Scanner object
        input.close();
    }
}