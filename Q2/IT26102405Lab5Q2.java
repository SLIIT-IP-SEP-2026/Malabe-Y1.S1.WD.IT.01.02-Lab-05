import java.util.Scanner;
public class IT26102405Lab5Q2 {

	public static void main(String[] main) {
	
		Scanner input = new Scanner(System.in);
		String prize;
		
		System.out.print("Enter the number of new members: ");
		int newMembersCount = input.nextInt();
		
		if (newMembersCount < 0) {
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		System.out.println();
		
		switch (newMembersCount) {
			case 0:
				prize = "No Prize";
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
		}
		
		System.out.println("Prize is a : " + prize);
	
	}

}