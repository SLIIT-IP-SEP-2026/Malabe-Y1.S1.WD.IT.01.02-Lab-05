import java.utill.Scanner;

public class IT26102680Lab2{
	public static void main(String[] args){
		Scanner scanner=new scanner(System.in);
		
		System.out.print("Enter the number of new members introduced:");
		int members=scanner.nextInt();
		
		scanner.close();
		
		if(members<0){
			System.out.println("Input must be a number 0 or greater");
			
		}else{
			switch(members){
				case0:
				     System.out.println("No Prize");
					 break;
			    case1:
				    System.out.println("Prize is a:Pen");
					break;
				case2:
				    System.out.println("Prize is a:Umbrella");
					break;
				case3
				    System.out.println("Prize is a:Bag");
					break;
			    case4
				    System.out.println("Prize is a:Travelling Chair");
					break;
				default:
				     System.out.println("Prize is a:Headphone");
					 break
			}
		}
	}
}