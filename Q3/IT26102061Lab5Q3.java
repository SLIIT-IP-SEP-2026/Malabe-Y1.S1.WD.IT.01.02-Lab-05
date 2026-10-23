import java.util.Scanner;
public class  IT26102061Lab5Q3{
	public static final double charge=48000;
	public static void main(String[] args){
		
		int start,end,days;
		double amount,totalAmount;
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("Enter Start Date(1-31): ");
		start=input.nextInt();
		 
		System.out.print("Enter End Date(1-31): ");
		end=input.nextInt();
		
		if((start>=1 && start<=31)&&(end>=1&&end<=31)){
			if(end>start){
				
				System.out.println("\nRoom Charge Per Day: Rs."+charge+"/=");
			
				days=end-start;
			
				System.out.println("Number of days reserved: "+days);
			
				amount=days*charge;
			
				if(days>=3||days<5){
					totalAmount=amount-(amount*10/100);
					System.out.println("Total Amount to be Paid: Rs."+totalAmount);
					return;
				}
				if(days>=5){
					totalAmount=amount-(amount*20/100);
					System.out.println("Total Amount to be Paid: Rs."+totalAmount);
					return;
				}
				else{
					System.out.println("Total Amount to be Paid: Rs."+amount);
					return;
				}
			}
			else{
				System.out.println("Error: Start Date must be less than End Date ");
			}	
		}
		else{
			System.out.println("Error: Days must be between 1 and 31");
		}
	}
}

			
			
				
				
				
			
			
		
		
		
		
		
		