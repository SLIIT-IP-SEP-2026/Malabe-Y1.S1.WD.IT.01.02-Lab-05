import java.util.Scanner;

public class IT26102456Lab5Q2 {
    public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced:");
		int members = input.nextInt();
		
		if(members < 0){
			System.out.println("Input must be a number 0 or greater");
		}else {
			String prize;
			
			switch(members){
				case 0:
				prize = "No prize";
				break;
				case 1:
				prize = "Pen";
				break;				
				case 2:
				prize = "Umbrella";
				break;
				case 3:
				prize = "bag";
				break;
				case 4:
				prize = "Travelling chair";
				break;
				default: // >=5
				prize = "Headphone";
				break;
			}
			if(members == 0){
				System.out.println("\n"+ prize);
			}else{
				System.out.println("\nprize is a :" + prize);
			}
		}
		input.close();
	}
}