import java.util.Scanner;
public class IT26100181LabQ2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced : ");
		int newMembers = input.nextInt();
		
		String result = "";
		if(newMembers >= 0){
			switch(newMembers){
				case 0: 
							System.out.println("No Prize");
							return;
				case 1: 
							result = "Pen";
							break;
				case 2: 
							result = "Umbrella";
							break;
				case 3: 
							result = "Bag";
							break;
				case 4: 
							result = "Travelling Chair";
							break;
				default: 
							result = "Headphone";
							break;
			}
		}else{
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		System.out.println();
		System.out.println("Prize is a : "+ result);
	}
}
