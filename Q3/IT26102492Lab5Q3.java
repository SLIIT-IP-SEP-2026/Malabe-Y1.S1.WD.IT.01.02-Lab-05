import java.util.Scanner;

public class IT26102492Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 0.10;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

        Scanner input = new Scanner(System.in);

        int startDate;
        int endDate;
        int numberOfDaysReserved;
        double totalAmountBeforeDiscount;
        double discountAmount;
        double totalAmountToBePaid;
        double discountRate = 0.0;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31
                || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date should be less than end date.");
            input.close();
            return;
        }

        numberOfDaysReserved = endDate - startDate;
        totalAmountBeforeDiscount =
                numberOfDaysReserved * ROOM_CHARGE_PER_DAY;

        // The table lists a 10% discount for 3–4 days.
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

        System.out.println();
        System.out.println("Number of days reserved: " + numberOfDaysReserved);
        System.out.printf("Total amount before discount: Rs. %.2f%n",
                totalAmountBeforeDiscount);
        System.out.printf("Discount amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Total amount to be paid: Rs. %.2f%n",
                totalAmountToBePaid);

        input.close();
    }
}