import java.util.Scanner;
public class IT26100181Lab5Q3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		final double perDayCharge = 48000.0;
		
		//Entering the start date...
		System.out.print("Enter the start date : ");
		int startDate = input.nextInt();
		if( 1 > startDate || startDate > 31 ){
			System.out.println("Days must be between 1 and 31");
			return;	
		}
		
		//Entering the end date...
		System.out.print("Enter the end date : ");
		int endDate = input.nextInt();
		if( 1 > endDate || endDate > 31 ){
			System.out.println("Days must be between 1 and 31");
			return;	
		}
		
		// Terminating the program if end date less than start date...
		if(endDate < startDate){
			System.out.print("Error : Start Date must be less than End Date");
			return;
		}
		
		double discount = 0.0;
		
		int noOfDaysReserved = endDate - startDate;
		double subTotal = perDayCharge*noOfDaysReserved;
		
		// Calculating the discount....
		if(3 <= noOfDaysReserved && 4 >= noOfDaysReserved ){
			discount = 10.0; 
			
		}else{
			discount = 20.0;
		}
		
		double totalAmountToPaid =  subTotal - subTotal*(discount/100.0);
		
		System.out.println("Room Charge Per Day : Rs."+perDayCharge+"/=");
		System.out.println("Number of Days Reserved : " +noOfDaysReserved );
		System.out.println("total AmountTo be Paid : " +totalAmountToPaid );	
	}
}