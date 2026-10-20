import java.util.Scanner;
public class IT26102406Lab5Q3
{	
	public static void main (String [] args)	
	{
		Scanner input = new Scanner (System.in);
		
		int discount;
		int totamount;
		final double roomCharge = 48000.0;

		System.out.print ("Enter the start date (1-31) : ");
		int startDate = input.nextInt();
		
		System.out.print ("Enter the end date (1-31) : ");
		int endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 ||
			endDate < 1 || endDate > 31 ) 
		{
			System.out.println ("Days must be between 1 and 31");
		}
		else if (startDate >= endDate) 
		{
			System.out.print("Start Date must be less than End Date ");
		}
		else {
			int days = endDate - startDate;
			double subTotal = roomCharge * days;
				discount = 0;

			if (days < 3) {
				discount = 0;
			}
			else if (days < 5) {
				discount = 10;
			}
			else {
				discount = 20;
			}

			double totalAmount = subTotal - (subTotal * discount / 100);

			System.out.println("Room Charge Per Day : Rs." + roomCharge + "/=");
			System.out.println("Number of Days Reserved : " + days);
			System.out.println("Total Amount to be Paid : " + totalAmount);
		}
	}
}