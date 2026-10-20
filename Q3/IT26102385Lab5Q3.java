import java.util.Scanner;
public class IT26102385Lab5Q3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the start date(1-31)");
		int startdate=sc.nextInt();
		System.out.print("Enter the end date(1-31)");
		int enddate=sc.nextInt();
		if(startdate>1||startdate<31||enddate>1||enddate<31){
			System.out.print("Error:Start date and end date cannot be less than 1 or greater than 31");
		}
		if(startdate<=enddate){
			System.out.print("Error: Start date should be less than the end date");
		}
		double numberofdaysreserved=enddate-startdate;
		double Room_charges_per_day=48000;
		double totalamount=numberofdaysreserved*48000;
		double Discount=0;
		
		int DISCOUNT_3_DAYS=10;
		int DISCOUNT_5_DAYS=20;
		
		if(numberofdaysreserved>=3&&numberofdaysreserved<=4){
			Discount=totalamount* DISCOUNT_3_DAYS/100;
		}
		if(numberofdaysreserved>=5){
			Discount=totalamount* DISCOUNT_5_DAYS/100;
		}
		double payableamount=totalamount-Discount;
		System.out.println();
	     System.out.println("Room charges per day"+ Room_charges_per_day);
		 System.out.println("Number of days reserved"+numberofdaysreserved);
		 System.out.println("payableamount"+payableamount);
         
	}
}


	
		