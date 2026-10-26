import java.util.Scanner;
public class IT26102557Lab5Q2{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int prize;
		System.out.println("Enter how many members you have introduced ");
		
		prize = input.nextInt();
		
		if(prize < 0 ){
			System.out.print("The numbers must be greater than or equal to zero");
			return;
			
		}
		
		switch(prize)
		{
			case 0 :System.out.print("No Prize");
			break;
			
			case 1 :System.out.print("Pen");
			break;
			
			case 2 :System.out.print("Umbrella");
			break;
			
			case 3 :System.out.print("Bag");
			break;
			
			case 4 :System.out.print("Travelling Chair");
			break;
			
			default :System.out.print("Headphone");
		}
	}
}