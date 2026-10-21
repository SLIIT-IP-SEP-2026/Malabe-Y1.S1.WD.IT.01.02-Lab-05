import java.util.Scanner;
public class IT26102480Lab5Q3{
	public static void main(String[]args){
		
		 final double ROOM_CHARGE_PER_DAY = 48000.0;
		 final double DISCOUNT_3_TO_4_DAYS= 0.1;
		 final double DISCOUNT_5_OR_MORE_DAYS= 0.2;
		 
		 int startDate, endDate,numberOfResevedDays;
	     double discountRate,discountAmount,totalBeforeDiscount,finalTotal;
	
			Scanner input = new Scanner(System.in);
	
	
			System.out.print("Enter start date(1-31):");
			startDate = input.nextInt();
	
			System.out.print("Enter end date(1-31):");
			endDate = input.nextInt();
	
			if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
				System.out.println("Days must be between 1 and 31");
			return;
			}
			
			if (startDate >= endDate){
				System.out.println("Error: Start date must be less than end date");
			return;
			}
			
			
				numberOfResevedDays= (endDate - startDate);
				discountRate = 0;
		
			if (numberOfResevedDays>=5){
				discountRate = DISCOUNT_5_OR_MORE_DAYS;
			}
			else if (numberOfResevedDays>=3) {
				discountRate = DISCOUNT_3_TO_4_DAYS;
			}
			else {
				discountRate = 0;
			}
			
			
			totalBeforeDiscount = numberOfResevedDays*ROOM_CHARGE_PER_DAY;
			discountAmount = totalBeforeDiscount*discountRate;
			finalTotal = totalBeforeDiscount-discountAmount;
			
			System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
			System.out.println("Number of Days Reserved: " + numberOfResevedDays);
			System.out.println("Total Amount to be Paid: " + finalTotal);
			
	}

}
	
	
	
	
	
	
