import java.util.Scanner;

public class IT26102641Lab5Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int members = sc.nextInt();
		
		if( members < 0 ){
			System.out.println("Input must be a number 0 or greater ");
			return;
		}
		
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
				prize = "Bag";
				break;
			case 4:
				prize = "Travelling Chair";
				break;
			default:
				prize = "Headphone";
				break;
		}
		
		if(members == 0){
			System.out.println("\n" + prize);
		} else {
			System.out.println("\nprize is a :" + prize);
		}
		
		sc.close();
	}
}