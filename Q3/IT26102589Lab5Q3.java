import java.util.Scanner;

public class IT26102589Lab5Q3 {

    public static void main(String[] args) {

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 10;
        final double DISCOUNT_20 = 20;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start date (day): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date (day): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            System.exit(0);
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            System.exit(0);
        }

        int days = endDate - startDate;
        double total = days * ROOM_CHARGE;
        double discountRate = 0;

        if (days >= 5) {
            discountRate = DISCOUNT_20;
        } else if (days >= 3) {
            discountRate = DISCOUNT_10;
        }

        double discount = total * discountRate / 100;
        double amountToPay = total - discount;

        System.out.println("Number of days reserved: " + days);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs " + amountToPay);

       
    }
}