import java.util.Scanner;

public class IT26101493Lab5Q3 {
    public static void main(String[] args) {
        
        final double room_Charge = 48000.0;
        final double discount_Rate_10 = 0.1;
        final double discount_Rate_20 = 0.2;
        
        Scanner input = new Scanner(System.in);

        int start_Date, end_Date, days;
        double total_Amount, Amount,discount;

        System.out.print("Enter the start date (1-31): ");
        start_Date = input.nextInt();

        System.out.print("Enter the end date (1-31): ");
        end_Date = input.nextInt();

        if (start_Date<1 || end_Date<1 || start_Date>31 || end_Date>31){
            System.out.print("Days must be between 1 and 31");
            return;
        }
        if(start_Date >= end_Date){
            System.out.print("Start Date must be less than End Date");
            return;
        }
        System.out.println();
        
        days = end_Date - start_Date;
        Amount = room_Charge * days;

        if (days < 3) {
            discount = 0;
        } else if (days >= 3 && days <= 4) {
            discount = Amount * discount_Rate_10;
        } else {
            discount = Amount * discount_Rate_20;
        }

        total_Amount = Amount - discount;

        System.out.println("Room Charge Per Day: Rs." + room_Charge + "/=");
        System.out.println("Number of Days Reserved: " + days);
        System.out.println("Total Amount to be paid: " + total_Amount);

    }
}
