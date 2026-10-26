import java.util.Scanner;
public class IT26102737Lab5Q2
{
	public static void main(String[] args)
	{
		Scanner hi =  new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced :");
		int number = hi.nextInt();
		
		if(number < 0 ){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		switch(number){			
			
			case 0:
			System.out.println("No Prize");
			break;
			
			case 1:
			System.out.println("Prize is : Pen");
			break;
			
			case 2:
			System.out.println("Prize is : Umbrella");
			break;
			
			case 3:
			System.out.println("Prize is : Bag");
			break;
			
			case 4:
			System.out.println("Prize is : Travelling Chair");		
			break;
			
			default:
			System.out.println("Prize is : Headphone");
		}	
	}
}	