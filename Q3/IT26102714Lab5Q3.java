import java.util.Scanner;

public class IT26102714Lab5Q3 {

    static final double ROOM_CHARGE_PER_DAY = 48000.00;
    static final double DISCOUNT_3_TO_4_DAYS = 10.0;
    static final double DISCOUNT_5_OR_MORE_DAYS = 20.0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startDate, endDate, daysReserved;
        double discountRate, totalAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            input.close();
            return;
        }

        daysReserved = endDate - startDate;

        if (daysReserved < 3) {
            discountRate = 0;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        totalAmount = totalAmount -(totalAmount * discountRate / 100);
        System.out.printf("%nRoom Charge Per Day: Rs. %.2f%n",
                ROOM_CHARGE_PER_DAY);
        System.out.println("Number of Days Reserved: " + daysReserved);
        System.out.printf("Total Amount to be Paid: Rs. %.2f%n",
                totalAmount);

        input.close();
    }
}