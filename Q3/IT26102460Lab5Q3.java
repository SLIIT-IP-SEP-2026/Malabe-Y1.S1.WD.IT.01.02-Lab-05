import java.util.Scanner;
public class IT26102460Lab5Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double Discount_Price, Price_After_Discount;
		
		System.out.print("Enter start date (1-31): ");
		int start_date = input.nextInt();
		
		System.out.print("Enter end date (1-31): ");
		int end_date = input.nextInt();
		
		int No_Of_Days = end_date - start_date;
		final double Price_Per_Day = 48000.00;
		double Price = No_Of_Days * Price_Per_Day;
		
		//Validating start date and end date
		
		if(start_date <= 1 && end_date <= 1){
			System.out.print("Start date and End date cannot be less than 1.");
			return;
		}
		else if(start_date <= 0 || end_date <= 0){
			System.out.print("Start date and End date cannot be 0 or less than 0");
			return;
		}
		else if(start_date >= 31 && end_date >= 31){
			System.out.print("Start date and End date cannot be greater than 31.");
			return;
		}
		else if(start_date > end_date){
			System.out.print("Start date cannot be greater End date.");
			return;
		}
	
		//Discount calculation
		if(No_Of_Days >= 5){
			Discount_Price = Price * 0.2;
		}
		else if(No_Of_Days >=3){
			Discount_Price = Price * 0.1;
		}
		else{
			Discount_Price = 0;
			System.out.print("No discount");
		}
		
		System.out.println(" ");
		
		System.out.println("Room Charge Per day: Rs. 48000.0/=");
		System.out.println("Number of Days Reserved: " + No_Of_Days);
		Price_After_Discount = Price - Discount_Price;
		System.out.println("Total Amount to be Paid: " + Price_After_Discount);
		
		
	}
}