import java.util.Scanner;

	public class IT26102591Lab5Q3{
		
		public static void main(String[] args) {
			
			final double ROOM_CHARGE_PER_DAY = 48000.00;
			final double DISCOUNT_3_TO_4_DAYS = 0.1;
			final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
			
			int startDate,endDate,numberOfDaysReserved;
			double totalAmountBeforeDiscount,discounntAmount,totalAmountToBePaid;
			
			double discountRate = 0;
			
			Scanner input = new Scanner(System.in);
			
			System.out.print("Enter Start Date (1-31): ");
			startDate = input.nextInt();
			System.out.print("Enter End Date (1-31): ");
			endDate = input.nextInt();
			
			if(startDate < 1 || startDate> 31 || endDate < 1 || endDate > 31){
				System.out.println("Invalid Date");
				return;
			}
			
			if(startDate >= endDate){
				System.out.println("Invalid Date");
				return;
			}
				numberOfDaysReserved = endDate - startDate;
				
				if(numberOfDaysReserved >= 3 && numberOfDaysReserved <=4){
					discountRate = DISCOUNT_3_TO_4_DAYS;
				}
					
				else if (numberOfDaysReserved >= 5){
					discountRate = DISCOUNT_5_OR_MORE_DAYS;
				}
				totalAmountBeforeDiscount = numberOfDaysReserved * ROOM_CHARGE_PER_DAY;
				discounntAmount = totalAmountBeforeDiscount * discountRate;
				totalAmountToBePaid = totalAmountBeforeDiscount - discounntAmount;
				
				System.out.println();
				System.out.println("Room Charge Per Day:" + ROOM_CHARGE_PER_DAY + "/=");
				System.out.println("Number of days Reserved:" + numberOfDaysReserved);
				System.out.println("Room Charge Per Day:" + totalAmountToBePaid);


		
		}
	}