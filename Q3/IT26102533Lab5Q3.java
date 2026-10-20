
import java.util.Scanner;

    public class IT26102533Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int discount;
        int totamount;

        final int roomCharge = 48000;

        System.out.print("Enter the start date (1-31): ");
        int startdate = input.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int enddate = input.nextInt();

        if (startdate < 1 || startdate > 31 ||
            enddate < 1 || enddate > 31) {

            System.out.println("Days must be between 1 and 31");

        } else if (startdate >= enddate) {

            System.out.println("Start date must be less than end date");

        }

            int numdays = enddate - startdate;
            int subtotal = roomCharge * numdays;

            if (numdays < 3) {
                discount = 0;
            } else if (numdays <= 4) {
                discount = 10;
            } else {
                discount = 20;
            }

            totamount = subtotal - (subtotal * discount / 100);

            System.out.println("Room charge per day: Rs. "
                    + roomCharge);
            System.out.println("Number of days reserved: "
                    + numdays);
            System.out.println("Total amount to be paid: Rs. "
                    + totamount);
        

        
    }
}
