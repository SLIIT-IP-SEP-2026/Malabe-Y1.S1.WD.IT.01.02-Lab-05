import java.util.Scanner;
public class IT26102639LAB5Q3{
    public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	      final double ROOM_CHARGE_PER_DAY = 48000.00;
		  final double DISCOUNT_3_TO_4_DAYS = 0.2;
		  final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		  
		  int startDate, endDate,numberOFDaysReserved;
		  double totalamountBeforedicount,discountAmount,totalAmountToBepaid;
		  
		  double discountRate = 0;
		  
		  System.out.print("enter start Date(1-31):");
		  startDate = input.nextInt();
		  
		  System.out.print("enter End Date(1-31):");
		  endDate = input.nextInt();
		  
		   // validation check
		   
		   if (startDate <1 || startDate >31 || endDate <1 || endDate >31){
		       System.out.print("error: Start date must be between 1 and 31");
			   
			   return;
			   
			}
		if (startDate >=endDate){
		        System.out.print("error: Start date must must be less than End Date");
				return;
			}
		numberOFDaysReserved= endDate-startDate;
	  
	  // check if the reservation is eligible for discount 
	  if(numberOFDaysReserved >= 3 && numberOFDaysReserved<=4){
		  discountRate=DISCOUNT_3_TO_4_DAYS;
	  }

	else if (numberOFDaysReserved >= 5){
		discountRate = DISCOUNT_5_OR_MORE_DAYS;
		
	}
     double totalAmountBeforeDiscount;

	totalAmountBeforeDiscount = numberOFDaysReserved*ROOM_CHARGE_PER_DAY;
	  discountAmount = totalAmountBeforeDiscount*discountRate;
	  totalAmountToBepaid = totalAmountBeforeDiscount-discountAmount;
	  
	  System.out.println();
       System.out.println("Room charge per Day :Rs "+ROOM_CHARGE_PER_DAY+"/=");
	   System.out.println("Number of Days Reserved:" + numberOFDaysReserved);
	   System.out.println("Total Amount to be paid :"+totalAmountToBepaid);
}

}