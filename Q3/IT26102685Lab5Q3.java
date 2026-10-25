
import java.util.Scanner;

public class IT26102685Lab5Q3 {
    public static void main(String[] args) {

      
        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_10 = 0.10;
        final double DISCOUNT_20 = 0.20;

        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter start date: ");
        int startDate = input.nextInt();

        System.out.print("Enter end date: ");
        int endDate = input.nextInt();

       
        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

       
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

       
        int days = endDate - startDate;

     
        double total = days * ROOM_CHARGE;
        double discount = 0;

        
        if (days >= 5) {
            discount = total * DISCOUNT_20;
        } else if (days >= 3) {
            discount = total * DISCOUNT_10;
        }

        double amountToPay = total - discount;

       
        System.out.println("Number of days reserved: " + days);
        System.out.println("Room charges per day: Rs. " + total);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Total amount to be paid: Rs. " + amountToPay);

        input.close();
    }
}
