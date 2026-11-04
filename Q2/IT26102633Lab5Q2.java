import java.util.Scanner;

public class IT26102633Lab5Q2 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of numbers introduced:");
		int members = input.nextInt();
		
		if (members < 0) {
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		String prize;
		
		switch (members) {
			case 0:
			prize = "No prize";
			
			System.out.println(prize);
			break;
			case 1:
			prize = "Pen";
			
			System.out.println("Prize is a : " + prize);
			break;
			case 2:
			prize = "Umberlla";
			
			System.out.println("Prize is a : " + prize);
			break;
			case 3:
			prize = "Bag";
			
			System.out.println("Prize is a : " + prize);
			break;
			case 4:
			prize = "Travelling Chair";
			
			System.out.println("Prize is a : " + prize);
			break;
			default: 
			prize = "Headphone";
			
			
		System.out.println("Prize is a : " + prize );
		break;
		}
	}
}

			
			
