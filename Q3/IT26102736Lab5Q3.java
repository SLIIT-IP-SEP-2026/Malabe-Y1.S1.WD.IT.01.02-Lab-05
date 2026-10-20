import java.util.Scanner; 
public class IT26102736Lab5Q3 {
	public static void main(String[] args) {
		
		//Creating Scanner object
		Scanner input= new Scanner(System.in);
		
		//Declaring Variables
		final double discountRate1 = 0; //no discountrate when reserved less than 3 days
		final double discountRate2 = 0.1;//10% discountrate when reserved 3-4 days
		final double discountRate3 = 0.2;//20% discount when reserved for 5 or more days
		final double roomChargePerDay = 48000; 
		double discountAmount,finalAmount,price;
		int startDate,endDate;
		
		//getting start date and end date
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		System.out.print("Enter End Date (1-31): ");
		endDate = input.nextInt();
		
		//Validating the dates
		if (startDate >= 1 && startDate <= 31 && endDate >= 1 && endDate <= 31) {
			if ( endDate  >= startDate ) {
				int reservedDays =( (endDate) - (startDate) ); 
				System.out.println("\nRoom charge per Day: Rs.  " +roomChargePerDay +"/=");
				System.out.println("Number of days reserved: " +reservedDays);
				if (reservedDays < 3) {
					price = (reservedDays*roomChargePerDay);
					discountAmount = price * discountRate1;
					finalAmount = price - discountAmount;
				}
				else if (reservedDays<5){
					price = (reservedDays*roomChargePerDay);
					discountAmount = price*discountRate2;
					finalAmount = price - discountAmount;
				}
				else {
					price = (reservedDays*roomChargePerDay);
					discountAmount = price*discountRate3;
					finalAmount = price - discountAmount;
				}
				System.out.println("TotalAmount to be Paid: " +finalAmount);
			}
			else {
				System.out.println("Error: Start Date must be less than End Date!");
			}
		}
		else {
			System.out.println("Error: Days must be between 1 and 31");
		}
		
	}
}	