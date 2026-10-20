import java.util.Scanner;

	public class IT26102591Lab5Q2{
		
		public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of new members introduced: ");
			int members = input.nextInt();
		
		if(members<0){
			System.out.println("Invalid number");
			return;
		}
		switch(members){
		case 0:
			System.out.print("No Prize");
		break;
		 case 1:
			System.out.print("Pen");
		break;
		 case 2:
			System.out.print("Umbrella");
		break;
		 case 3:
			System.out.print("Bag");
		break;
		 case 4:
			System.out.print("Travelling Chair");
		break;
		
		default:
		
		System.out.println("Headphones");
		  }
						
		}
		
	}