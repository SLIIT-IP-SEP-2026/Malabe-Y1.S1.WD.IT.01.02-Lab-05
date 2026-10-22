import java.util.Scanner;

   public class IT26102636Lab5Q3{
	   
	 public static void main(String[] args){
		 
		 final double ROOM_CHARGE_PER_DAY = 48000.00;
		 final double DISCOUNT_3_TO_4_DAYS = 0.1;
		 final double DISCOUNT_5_OR_MORE_DAYS= 0.2;
		 final double numberofDaysReserved = 3;
		 
		    int startDate , endDate , numberOfDaysReserved;
			double totalAmountBeforeDiscount , discountAmount , totalamountToBepaid;
			
			double discountRate = 0;
			
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Start Date(1-31): ");
	startDate = input.nextInt();
	
	System.out.print("Enter End Date(1-31): ");
	endDate = input.nextInt();
	
	//Validate dates
	if(startDate <1 || startDate > 31 ||  endDate<1 || endDate >31){
		
		System.out.println("Error: Dates must  be between 1 and 31.");
		return;
	}
	
	//Validate startDate and endDate
	if(startDate >= endDate){
		
		System.out.println("Error: Start date must  be less than End Date.");
	return;
	}
	
	numberOfDaysReserved = endDate - startDate;
	
	//Check if the reservation is eligible for discount
	if(numberOfDaysReserved >= 3 && numberOfDaysReserved <=4){
		discountRate = DISCOUNT_3_TO_4_DAYS;
	}
	
	     else if (numberOfDaysReserved >= 5){
	    discountRate= DISCOUNT_5_OR_MORE_DAYS;
		}
		
	totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
	discountAmount = totalAmountBeforeDiscount * discountRate;
	totalamountToBepaid = totalAmountBeforeDiscount - discountAmount;
	
	
	System.out.println();
	System.out.println("Room Charge Per Day : Rs. " + ROOM_CHARGE_PER_DAY+"/=");
	System.out.println("Number of Days Reserved: " +numberOfDaysReserved);
	System.out.println("Total Amount to be paid:Rs. "+totalamountToBepaid);
	
	 }
	 
	 
   }