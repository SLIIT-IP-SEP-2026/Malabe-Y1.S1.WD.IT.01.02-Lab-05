import java.util.Scanner;
public class IT26102460Lab5Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of people being introduced: ");
		int No_People = input.nextInt();
		
		if(No_People < 0){
			System.out.print("Number of people should be 0 or greater.");
		}
		else{
			switch(No_People)
			{
			case 0: System.out.print("No Prize");
			break;
			
			case 1: System.out.print("Prize is Pen");
			break;
			
			case 2: System.out.print("Prize is Umbrella");
			break;
			
			case 3: System.out.print("Prize is Bag");
			break;
			
			case 4: System.out.print("Prize is Travelling Chair");
			break;
			
			default: System.out.print("Prize is Headphones");
			break;
			}
		}
	}
}