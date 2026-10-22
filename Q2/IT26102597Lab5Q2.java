import java.util.Scanner;
public class IT26102597Lab5Q2{
 public static void main (String [] args){

    //Create an object called input to Scanner class
    Scanner input = new Scanner(System.in);

    //Declare variables
    int number;

    System.out.println("Enter the number of new member introduced : ");
    number = input.nextInt();


    //Check numbers
	
    if (number < 0)
	{
		System.out.println("Input must be a number 0 or greater");
	}		
	
	else
	{
		switch(number)
	{
		case 0 : System.out.println("No Prize");
		           break;
				   
		case 1 : System.out.println("Prize is a : Pen");
		           break;
				   
		case 2 : System.out.println("Prize is a : Umbrella");
		           break;
				   
		case 3 : System.out.println("Prize is a : Bag");
		           break;
				   
		case 4 : System.out.println("Prize is a Travelling Chair");
                   break;
        
        default :System.out.println("Prize is a : Headphone");	
                break;		
	}
	}
		
   
}
}
