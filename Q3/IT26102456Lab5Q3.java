import java.util.Scanner;

public class IT26102456Lab5Q3 {
    public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		final double ROOM_CHARGE_PER_DAY = 48000.0;
		final int MIN_DAY = 1;
		final int MAX_DAY = 31;
		
		System.out.print("Enter start date (1-31):");
		int startdate = input.nextInt();
		
		System.out.print("Enter End date (1-31):");
		int enddate = input.nextInt();
		
		if(startdate < MIN_DAY || startdate > MAX_DAY || enddate < MAX_DAY){
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		if(startdate >= enddate){
			System.out.println("Error: start date must be less than End Date");
			return;
		}
		
		int noofDays = enddate - startdate;
		double totalcharge = noofDays * ROOM_CHARGE_PER_DAY;
		double totalamounttobepaid = 0;
		
		if(noofDays < 3){
			totalamounttobepaid = totalcharge;
		}else if (noofDays >= 3 && noofDays <= 4){
			totalamounttobepaid = totalcharge - (totalcharge + 10/ 100);
		}else{
			totalamounttobepaid = totalcharge - (totalcharge * 20/ 100);
		}
		
		System.out.println("\nRoom charge per day: Rs." + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("Number of Days Reserved:" + noofDays);
		System.out.println("Total Amount to be paid:" +totalamounttobepaid);
		
		input.close();
	}
}