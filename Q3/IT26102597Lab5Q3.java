import java.util.Scanner;
 public class IT26102597Lab5Q3{
	public static void main (String [] args){

    //Create an object called input to Scanner class
    Scanner input = new Scanner(System.in);

    
	//take user input
    System.out.println("Enter Start Date (1-31): ");
	int startDate = input.nextInt();
	
	
	
	//Check Start Date
	if (startDate > 31 || startDate <= 0)
	{
		System.out.println("Enter End Date (1-31): ");
	}
	
	else
	{
		System.out.println("Enter End Date (1-31): ");
	}
	
	int endDate = input.nextInt();
	
	if(startDate > 31 || startDate <= 0 || endDate > 31 || endDate <= 0)
	{
		System.out.println("Days mut be between 1 and 31");
		return; //Exit the program
	}
	
	
	    
	else if (startDate >= endDate)
	{
		System.out.println("Error: Start Date must be less than End Date");
		return; //Exit the program
	}
	
	double roomChargePerDay = 48000;
		
		System.out.println("Room charge per Day: Rs. " + roomChargePerDay + "/=");
	
    //Check Deserved Days	
	int reservedDays = (endDate-startDate);
	System.out.println("Number of Days Reserved: " + reservedDays);
	
	    
	double discount10 = ((roomChargePerDay*(endDate-startDate)*10)/100);
	double discount20 = ((roomChargePerDay*(endDate-startDate)*20)/100);
	
	double totalAmount = (reservedDays*roomChargePerDay);
	double totalAmountWith10 = ((reservedDays*roomChargePerDay) - discount10);
	double totalAmountWith20 = ((reservedDays*roomChargePerDay) - discount20);
	
    
	if (reservedDays < 3)
	{
		System.out.println("Total Amount to be paid: " + totalAmount);
	}
	
	if (reservedDays == 3 || reservedDays ==4)
	{
		System.out.println("Total Amount to be paid: " + totalAmountWith10);
	}
	
	if (reservedDays >= 5)
	{
		System.out.println("Total Amount to be paid: " + totalAmountWith20);
	}
	
		
 }
 }