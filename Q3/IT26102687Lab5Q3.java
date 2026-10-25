import java.util.Scanner;

public class IT26102687Lab5Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double ROOM_CHARGE = 48000.00 ;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        int startDate, endDate, daysReserved;
        double discountRate, totalAmount, discount, amountToPay;

        System.out.print("Enter start date(1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter end date(1-31): ");
        endDate = input.nextInt();
		
		
		

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date!");

        } else if (startDate >= endDate) {

            System.out.println("Start date must be less than end date!");

        } else {

            daysReserved = endDate - startDate;

            totalAmount = daysReserved * ROOM_CHARGE;

            if (daysReserved < 3) {
                discountRate = 0;
            } else if (daysReserved <= 4) {
                discountRate = DISCOUNT_10;
            } else {
                discountRate = DISCOUNT_20;
            }

            discount = totalAmount * discountRate;

            amountToPay = totalAmount - discount;
			
			System.out.println();

            System.out.println("Number of days reserved: " + daysReserved);

            System.out.printf("Total room charges: Rs. %.2f%n", totalAmount);

            System.out.printf("Discount: Rs. %.2f%n", discount);

            System.out.printf("Amount to be paid: Rs. %.2f%n", amountToPay);
        }

        
    }
}
