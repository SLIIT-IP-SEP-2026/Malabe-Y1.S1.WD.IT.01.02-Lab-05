import java.util.Scanner;
public class IT26102405Lab5Q3 {

	public static void main(String[] main) {
	
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE = 48000.0;
		int startDate, endDate, noOfDays;
		double finalPrice;
		final double DISCOUNT_3_OR_4 = 0.1;
		final double DISCOUNT_5_OR_MORE = 0.2;
		
		System.out.print("Enter Start Date (1-31): ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		endDate = input.nextInt();
		
		if (endDate < startDate) {
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		if ((startDate < 1)||(startDate > 31)||(endDate < 1)||(endDate > 31)) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		noOfDays = endDate - startDate;
		
		if (noOfDays < 3) {
			finalPrice = noOfDays * ROOM_CHARGE;
		}
		else if ((noOfDays == 3)||(noOfDays == 3)) {
			finalPrice = noOfDays * ROOM_CHARGE * (1-DISCOUNT_3_OR_4);
		}
		else {
			finalPrice = noOfDays * ROOM_CHARGE * (1-DISCOUNT_5_OR_MORE);
		}
		
		System.out.println();
		System.out.println("Room Charge Per Day: " + ROOM_CHARGE);
		System.out.println("Number of Days Reserved: " + noOfDays);
		System.out.println("Total Amount to be Paid: " + finalPrice);
		
		
	
	}

}