import java.util.Scanner;

public class IT26102435Lab5Q3 {
    public static void main(String[] args) {
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final int MIN_DATE = 1;
        final int MAX_DATE = 31;
        final double DISCOUNT_3_TO_4_DAYS = 0.10;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < MIN_DATE || startDate > MAX_DATE ||
            endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE_PER_DAY;

        if (days >= 5) {
            total = total - (total * DISCOUNT_5_OR_MORE_DAYS);
        } else if (days >= 3) {
            total = total - (total * DISCOUNT_3_TO_4_DAYS);
        }

        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be Paid: " + total);
    }
}
