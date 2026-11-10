import java.util.Scanner;

public class IT26102730Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4 = 0.10;
        final double DISCOUNT_5_OR_MORE = 0.20;

        System.out.print("Enter start date (day): ");
        int startDate = input.nextInt();
        System.out.print("Enter end date (day): ");
        int endDate = input.nextInt();

        // Validation 1
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Start date and end date must be between 1 and 31.");
            return;
        }

        // Validation 2
        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than the end date.");
            return;
        }

        int noOfDays = endDate - startDate;
        double totalAmount = noOfDays * ROOM_CHARGE_PER_DAY;
        double discount = 0;

        if (noOfDays >= 3 && noOfDays <= 4) {
            discount = totalAmount * DISCOUNT_3_TO_4;
        } else if (noOfDays >= 5) {
            discount = totalAmount * DISCOUNT_5_OR_MORE;
        }

        double amountToPay = totalAmount - discount;

        System.out.println("Number of days reserved: " + noOfDays);
        System.out.println("Total amount to be paid: Rs " + amountToPay);
    }
}