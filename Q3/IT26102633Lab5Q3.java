import java.util.Scanner;

public class IT26102633Lab5Q3 {
	
	public static final double ROOM_CHARGE_PER_DAY = 48000.0;
    public static final double DISCOUNT_3_4_DAYS = 0.10; 
    public static final double DISCOUNT_5_OR_MORE = 0.20; 
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            System.exit(0);
        }
		
		int numberOfDays = endDate - startDate;
		
		double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
		
		if (numberOfDays >= 5) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_5_OR_MORE);
        } else if (numberOfDays >= 3) {
            totalAmount = totalAmount - (totalAmount * DISCOUNT_3_4_DAYS);
        }
		
		System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDays);
        System.out.println("Total Amount to be Paid: " + totalAmount);
		
		
		
		
		
	}
}
	
