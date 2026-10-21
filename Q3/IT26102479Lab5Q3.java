import java.util.Scanner;

public class IT26102479Lab5Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        final double ROOM_CHARGE = 48000.0;
        
        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();
        
        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
        } 
        
        else if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
        } 
        else {
            
            int numberOfDays = endDate - startDate;
            
            
            double totalRoomCharge = numberOfDays * ROOM_CHARGE;
            
            
            double discountRate = 0.0;
            if (numberOfDays >= 5) {
                discountRate = 0.20; 
            } else if (numberOfDays >= 3) {
                discountRate = 0.10; 
            } else {
                discountRate = 0.0;  
            }
            
            
            double totalAmount = totalRoomCharge - (totalRoomCharge * discountRate);
            
            
            System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
            System.out.println("Number of Days Reserved: " + numberOfDays);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }
        
        input.close();
    }
}