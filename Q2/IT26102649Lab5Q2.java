import java.util.Scanner;

public class IT26102649Lab5Q2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int members = input.nextInt();
		
		if(members < 0){
		System.out.println("Input must be a number 0 or greater");
		}else{
		int key = (members>=5) ? 5:members;
		
			switch (key){
			case 0 :
			System.out.println("\nNo Prize");
			break;
			case 1 :
			System.out.println("\nPrize is a : Pen");
			break;
			case 2 :
			System.out.println("\nPrize is a : Umbrella");
			break;
			case 3 :
			System.out.println("\nPrize is a : Bag");
			break;
			case 4 :
			System.out.println("\nPrize is a : Travelling Chair");
			break;
			case 5 :
			System.out.println("\nPrize is a : Headphone");
			break;
			}
		}
	}
}