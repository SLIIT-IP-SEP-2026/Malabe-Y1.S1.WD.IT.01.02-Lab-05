import java.util.Scanner;

public class IT26102061Lab5Q2{
	public static void main(String[] args){
		int newMembers;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced : ");
		newMembers=input.nextInt();
		if(newMembers>0){
			
			switch(newMembers){
				case 0 : System.out.print("\nNo Prize\n");
						break;
				case 1 : System.out.print("\nPrize is a : Pen\n");
						break;
				case 2 : System.out.print("\nPrize is a : Umbrella\n");
						break;
				case 3 : System.out.print("\nPrize is a : Bag\n");
						break;
				case 4 : System.out.print("\nPrize is a : Travelling Chair\n");
						break;
				case 5 : System.out.print("\nPrize is a : Headphone\n");
						break;
				default :System.out.print("\nPrize is a : Headphone\n");
			}
		}
		else{
			System.out.print("\nInput must be a number 0 or greater\n");
		}
	}
}

	
	
	

			