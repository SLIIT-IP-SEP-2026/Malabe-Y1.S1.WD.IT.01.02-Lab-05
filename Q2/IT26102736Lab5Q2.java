import java.util.Scanner; 
public class IT26102736Lab5Q2 {
	public static void main(String[] args) {
			
			//Creating scanner object
			Scanner input = new Scanner(System.in); 
			
			//Declare variable
			String price;
			int noOfNewMembers ;
			
			//get a input
			System.out.print("Enter the number of new members introduced: "); 
			noOfNewMembers = input.nextInt();
			
			
			//Validating the entered numeer 
			if (noOfNewMembers >= 0) {
				
				//Finding the prize the customer is entilted to using switch statement
				switch (noOfNewMembers) {
					case 0: System.out.println("No Prize");
							break;
					
					case 1: System.out.println("Prize is a: Pen");
							break;
					
					case 2: System.out.println("Prize is a: Umbrella");
							break;
					
					case 3: System.out.println("Prize is a: Bag");
							break;
					
					case 4: System.out.println("Prize is a: Travelling chair");
							break;
					
					default: System.out.println("Prize is a: Headphone");
							break;
				}
			}
			
			else{
				System.out.println("input must be a number 0 or greater.");
			}
			
	}
}