import java.util.Scanner;

    public class IT26101754Lab5Q3 {
	
	    public static void main(String[] args) {
		
		   final double ROOM_CHARGE_PER_DAY = 48000.00;
		   final double DISCOUNT_3_TO_4_DAYS = 0.1;
		   final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
		   
		   int startdate,endDate,numberofDaysReserved;
		   double totalAmountBeforeDiscount,discountAmount,totalAmountToBepaid;
		   double discountRate = 0;
		   
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the start date (1-31): ");
        startdate = input.nextInt();
        System.out.print("Enter the end date (1-31): ");
        endDate = input.nextInt();
        if(startdate < 1 || startdate > 31 || endDate < 1 || endDate > 31) {
          System.out.println("Error : Days must be between 1 and 31");
		  return;
		}
        
        if (startdate >= endDate) {
           System.out.println("Error : Days must be less than End Date");
           return;
        }
        numberofDaysReserved = endDate - startdate;
        if (numberofDaysReserved >= 3 && numberofDaysReserved <= 4) {
           discountRate = DISCOUNT_3_TO_4_DAYS;
        }
        else if (numberofDaysReserved >= 5) {
             discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        totalAmountBeforeDiscount = numberofDaysReserved * ROOM_CHARGE_PER_DAY;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBepaid = totalAmountBeforeDiscount - discountAmount;

        System.out.println();		
		System.out.println("ROOM_CHARGE_PER_DAY : Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("numberofDaysReserved : " + numberofDaysReserved);
        System.out.println("Total amount to be paid : " + totalAmountToBepaid);

	}
}	

