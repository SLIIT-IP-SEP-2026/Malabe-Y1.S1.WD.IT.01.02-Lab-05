import java.util.Scanner;

public class IT26102402Lab5Q3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE = 48000.00;
		final double DISCOUNT_10 = 0.10;
		final double DISCOUNT_20 = 0.20;
		
		System.out.print("Enter Start Date (1-31): ");
		int start = input.nextInt();
		
		System.out.print("Enter End Date(1-31):");
		int end = input.nextInt();
		
		if(start < 1 || start > 31 || end < 1 || end > 31){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		
		if(start>=end){
			System.out.println("Error: Start Date must be less than End Date");
			return;
		}
		
		int days = end - start;
		double total = days* ROOM_CHARGE;
		
		if(days >= 3 && days <= 4){
			total = total - (total * DISCOUNT_10);
		}else if (days >= 5){
			total = total - (total * DISCOUNT_20);
		}
		
		System.out.println();
		System.out.println("Room charge per day: Rs. " + ROOM_CHARGE + "/=");
		System.out.println("Number of days reserved: " + days);
		System.out.println("Total amount to be paid: " + total);
}
}