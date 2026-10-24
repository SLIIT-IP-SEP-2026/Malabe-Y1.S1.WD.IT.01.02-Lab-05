import java.util.Scanner;

public class IT26102680Lab5Q3{
	
	public static final double ROOM_CHARGE_PER_DAY=48000.00;
	public static final double DISCOUNT_3_TO_4DAYS=10.0;
	public static final double DISCOUNT_5_OR_MORE_DAYS=20.0;
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Start Date(1-31): ");
		int startDate=scanner.nextInt();
		
		System.out.print("Enter End Date(1-31): ");
		int endDate=scanner.nextInt();
		
		if(startDate<1||startDate>31||endDate<1||endDate>31){
			System.out.println("Error:Days must be between 1 and 31");
			return;
		}
		if(startDate>=endDate){
			System.out.println("Error:start Date must be less than End Date");
			return;
		}
		int daysReserved=endDate-startDate;
		
		doublediscountRate=0.0;
		if(daysReserved>=3 && daysReserved<=4){
			discountRate=DISCOUNT_3_TO_4_DAYS;
		}else if (daysReserved>=5){
			discountRate=DISCOUNT_5_OR_MORE_DAYS;
		}
		
		double totalBeforeDiscount= daysReserved*ROOM_CHARGE_PER_DAY;
		double totalAmount=totalBeforeDiscount-(totalBeforeDiscount*(discountRate/100.0));
		
		System.out.println();
		System.out.println("Room Charge Per Day:Rs."+ROOM_CHARGE_PER_DAY+"/+");
		Ststem.out.println("Number of Days Reserved:"+daysReserved);
		System.out.println("Total Amount to be Paid:"+totalAmount);
		
		scanner.close();
	}
}