import java.util.Scanner;

public class IT26102528Lab5Q3 {
    public static void main(String[] args) {

        // Create a Scanner object to get keyboard input
        Scanner input = new Scanner(System.in);

        // Declare constants for the room charge and discount rates
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_10 = 10.0;
        final double DISCOUNT_20 = 20.0;

        // Input the reservation start date
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();

        // Input the reservation end date
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        // Validate that both dates are between 1 and 31
        if (startDate < 1 || startDate > 31
                || endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");

            input.close();
            return;
        }

        // Validate that the start date is before the end date
        if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");

            input.close();
            return;
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate;

        // Initially assume there is no discount
        double discountRate = 0.0;

        // Select the discount according to the number of days
        if (numberOfDays < 3) {
            discountRate = 0.0;
        } else if (numberOfDays <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        // Calculate the total room charge before the discount
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;

        // Apply the discount to calculate the final payment
        totalAmount = totalAmount
                - (totalAmount * discountRate / 100);

        // Display the room charge per day
        System.out.println();
        System.out.println("Room Charge Per Day: Rs. "
                + ROOM_CHARGE_PER_DAY + "/=");

        // Display the number of days reserved
        System.out.println("Number of Days Reserved: " + numberOfDays);

        // Display the final amount to be paid
        System.out.println("Total Amount to be Paid: " + totalAmount);

        // Close the Scanner object
        input.close();
    }
}