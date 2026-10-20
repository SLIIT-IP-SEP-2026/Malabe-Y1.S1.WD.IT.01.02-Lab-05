 import java.util.Scanner;

 public class IT26102641Lab5Q3{
	public static void main(String[] args){
		final double RATE = 48000;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the start date(1-31): ");
		int s = sc.nextInt();
		System.out.print("Enter the end date(1-31): ");
		int e = sc.nextInt();
		
		if( s < 1 || s > 31 || e < 1 || e > 31 ){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		if( s >= e ){
			System.out.println("Error: start date must be less than end date ");
			return;
		}
		
		int days = e-s;
		double total = days * RATE;
		
		if(days >= 3 && days <= 4) total = total * 0.9;
		else if(days >= 5) total = total * 0.8;
		
		System.out.println("\nRoom charge per day: Rs. " + RATE + "/=");
		System.out.println("Number of days reserved: " + days);
		System.out.println("Total Amount to be paid: " + total);
	}
}