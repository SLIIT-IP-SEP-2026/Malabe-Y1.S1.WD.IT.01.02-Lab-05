import java.util.Scanner;
public class IT26102477Lab5Q3{
    public static void main (String [] args){
		
     Scanner input = new Scanner(System.in);
	 
	 final int MIN_DAY = 1;
	 final int MAX_DAY = 31;
	 
	 System.out.println("Enter start date (1-31): ");
	 int startDate = input.nextInt();
	 
	 System.out.println("Enter end date (1-31): ");
	 int endDate = input.nextInt();
	 
	 int noOfDays = endDate - startDate;
	 final double pricePerDay = 48000.00;
	 double price = noOfDays * pricePerDay;
	 
    
	 
	 if(startDate < MIN_DAY || endDate > MAX_DAY && startDate < MAX_DAY ){
		 System.out.println("Error: Days must be between 1 and 31");
		 return;
		}

	
	if (startDate > endDate) {
            System.out.println("Error: Start date cannot be greater than end date.");
            return;
        }
	
	
	System.out.println("Room charge per day: " + pricePerDay);
	
	double discountPrice = 0.00;
	if (noOfDays >= 5) {
		discountPrice = price * 0.2;
		System.out.print(noOfDays);
	}
	else if (noOfDays >= 3) {
		discountPrice = price * 0.1;
		System.out.print(noOfDays);
	}
	else {
		System.out.println("No discount");
	}
	
	System.out.println("number of days reserved: " + noOfDays);
	double priceAfterDiscount = price - discountPrice;
	System.out.print(priceAfterDiscount);
    
}
}