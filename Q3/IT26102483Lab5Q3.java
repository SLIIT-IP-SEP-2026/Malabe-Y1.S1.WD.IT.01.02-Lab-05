import java.util.Scanner;
public class IT26102483Lab5Q3
{
	public static void main (String[]args)
	{
		double totalAmount, discount1,discount2, chargesPerDay;
		int date1, date2, numberOfDays;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter start date (1-31):");
		date1=input.nextInt();
		System.out.print("Enter end date (1-31):");
		date2=input.nextInt();
		if ( date1<1|| date1>31|| date2<1||date2>31){
			System.out.print("Error:Days must be between 1 and 31");
			return;
		}
		if ( date1>date2){
			System.out.print("Error: Start date must be less than End date");
			return;
		}
		chargesPerDay=48000.0 ;
		System.out.println(" ");
		System.out.println(" Room charge per day:"+chargesPerDay);
		System.out.print("Number of Days Reserved:");
		numberOfDays=input.nextInt();
		totalAmount= numberOfDays*chargesPerDay;
		discount1=totalAmount*0.90;
		discount2=totalAmount*0.80;
		if (numberOfDays<3){
			System.out.println("Total amount to be paid:" +totalAmount);
		}
		else if (numberOfDays<5){
			System.out.println("Total amount to be paid:" +discount1);
		}
		else {
			System.out.println("Total amount to be paid:"+discount2);
		}
	}
}
			