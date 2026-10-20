import java.util.Scanner;

public class IT26102395Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

        
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Invalid date.");
            return;
        }

        
        if (startDate >= endDate) {

            System.out.println("Start date should be less than end date.");
            return;
        }

        int days = endDate - startDate;

        double discountRate;

        if (days < 3) {
            discountRate = 0;
        } else if (days <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        double total = days * ROOM_CHARGE;
        double discount = total * discountRate;
        double amountToPay = total - discount;
		
		System.out.println("Room Charge Per Day:"+ROOM_CHARGE);

        System.out.println("Number of days reserved: " + days);
        
       
        System.out.println("Amount to be paid: Rs. " + amountToPay);
    }
}