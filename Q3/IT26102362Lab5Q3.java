import java.util.Scanner;
public class  IT26102362Lab5Q3{
	
	public static final double ROOMPRICE = 48000;
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int startDate, endDate, numOfDayReserved=0;
		double totalAmount=0;
		
		System.out.print("Enter Start Date: ");
		startDate = input.nextInt();
		
		System.out.print("Enter End Date: ");
		endDate = input.nextInt();
		
		if ((startDate>0)&&(startDate<=31) && (endDate>0)&&(endDate<=31)){
			if (startDate<endDate){
				numOfDayReserved = endDate-startDate;
				if (numOfDayReserved<3){
					totalAmount = numOfDayReserved*ROOMPRICE;
				}
				else if((numOfDayReserved >= 3) && (numOfDayReserved<5)){
					totalAmount = (numOfDayReserved*ROOMPRICE) - (numOfDayReserved*ROOMPRICE*10/100);
				}
				else if(numOfDayReserved>4){
					totalAmount = (numOfDayReserved*ROOMPRICE) - (numOfDayReserved*ROOMPRICE*20/100);	
				}
			}
			else{
				System.out.println("Start date should be less than the end date");
			}
		}
		else{
			System.out.println("Start date and end date cannot be less than 1 or greater than 31");
		}
		if (numOfDayReserved>0){
			System.out.println("\nRoom Charge Per Day: Rs."+ROOMPRICE+"/=");
			System.out.println("Number of Days Reserved: "+numOfDayReserved);
			System.out.println("Total Amount to be Paid: "+totalAmount);
		}
	}
}