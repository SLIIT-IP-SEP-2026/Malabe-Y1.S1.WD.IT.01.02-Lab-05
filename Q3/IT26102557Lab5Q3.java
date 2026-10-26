import java.util.Scanner;
public class IT26102557Lab5Q3{

	public static void main(String[] args){
	
	 final double RoomCharge = 48000;
	 final double RoomDisc10 = 0.9;
	 final double RoomDisc20 = 0.8;
	
	double StartDate,EndDate,total,Stay;
		Scanner input = new Scanner(System.in);
		
			System.out.println("Enter Start Date");
			StartDate = input.nextDouble();
			
			if (StartDate < 1 || StartDate > 31){
				System.out.println("Start Date Must Be Between 1-31");
				return;
				}
			System.out.println("Enter End Date");
			EndDate = input.nextDouble();
			
			if (EndDate < 1 || EndDate > 31){
				System.out.println("End Date Must Be Between 1-31");
				return;
			}
			if (EndDate <= StartDate){
				System.out.println("End Date must not be same or smaller than Start Date");
				return;
			}
			
				Stay=EndDate-StartDate;
				
				System.out.println("Room Charge Per Day "+RoomCharge+"/=");
				System.out.println("The number of Days Reserved "+Stay);
			
			
			
			if (Stay<3){
				System.out.println("Total Amount To Be Paid "+Stay*RoomCharge+"/=");
			}
			else if(Stay<5){
				System.out.println("Total Amount To Be Paid "+Stay*RoomCharge*RoomDisc10+"/=");
			}
			else{
				System.out.println("Total Amount To Be Paid "+Stay*RoomCharge*RoomDisc20+"/=");
			}
				
				
			
				
		
		

	}
}