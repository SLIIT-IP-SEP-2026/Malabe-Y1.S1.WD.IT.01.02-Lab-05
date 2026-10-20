import java.util.Scanner;
public class IT26102362Lab5Q2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int numberOfNewMembers;
		
		System.out.print("Enter the number of new members introduced: ");
		numberOfNewMembers = input.nextInt();
		
		if (numberOfNewMembers >= 0){
			switch(numberOfNewMembers){
				case 0 : System.out.println("No Prize");
						 break;
						 
				case 1 : System.out.println("Prize is a pen");
						 break;
				
				case 2 : System.out.println("Prize is an umbrella");
						 break;
						 
				case 3 : System.out.println("Prize is a bag");
						 break;
						 
				case 4 : System.out.println("Prize is a travelling chair");
						 break;
						 
				default : System.out.println("Prize is a headphone");
				
			}
		}
		else{
			System.out.println("Input must be a number 0 or greater");
		}
		
		
	}
}