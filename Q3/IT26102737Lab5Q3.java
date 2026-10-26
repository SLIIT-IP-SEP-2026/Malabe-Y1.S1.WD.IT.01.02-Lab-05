import java.util.Scanner;
public class IT26102737Lab5Q3
{
	public static void main(String[] args)
	{
		
		final double ROOM_CHARGE_PER_DAY = 48000.00;
		final double DISCOUNT_3_TO_4_DAYS = 0.1;
		final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		
		int startDate , endDate , numberOfDaysReserved;
		double totalAmountBeforDiscount , discountAmount , totalAmountToBePaid;
			
		double discountRate = 0;
			
		Scanner hi = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31):");
		startDate = hi.nextInt();
		
		System.out.print("Enter End Date(1-31:");
		endDate = hi.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return; 
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return; 
        }
        
        int noOfDays = endDate - startDate;
        
        double totalAmount = noOfDays * ROOM_CHARGE_PER_DAY;
        discountRate = 0;
        
        if (noOfDays >= 3 && noOfDays <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (noOfDays >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }
        
        discountAmount = totalAmount * discountRate ;
        double amountToBePaid = totalAmount - discountAmount;
      
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/-");
        System.out.println("Number of Days Reserved: " + noOfDays);
        System.out.println("Total Amount to be Paid: " + amountToBePaid);
    }
}
		