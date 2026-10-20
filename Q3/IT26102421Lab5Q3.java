import java.util.Scanner;
public class IT26102421Lab5Q3{
 public static void main(String[] args){
 int room_charge_per_day=48000;
 int discountrate;
 Scanner sc=new Scanner(System.in);
 
 System.out.print("Enter the start date: ");
 int startdate=sc.nextInt();
 
 System.out.print("Enter the end date: ");
 int enddate=sc.nextInt();
 
 if (startdate<1 || startdate>31 || enddate<1 || enddate>31){
	System.out.println("Error: Dates must be between 1 and 31");
	return;
}
 if (startdate>=enddate){
	 System.out.println("Start date must be less than end date");
	 return;
 }
 int no_of_days=enddate-startdate;
 
 if (no_of_days<3){
	 discountrate=0;
 }
 else if (no_of_days<=4){
	 discountrate=10;
 }
 else{
	 discountrate=20;
 }
 double total_room_charges=room_charge_per_day*no_of_days;
 double total_amount=total_room_charges-(total_room_charges*discountrate/100);
 
 System.out.println("Room charge per day is: "+ room_charge_per_day);
 System.out.println("Number of days reserved: "+ no_of_days);
 System.out.println("The total amount is: "+ total_amount);
 }
}