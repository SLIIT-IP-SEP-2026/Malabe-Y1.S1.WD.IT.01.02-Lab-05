import java.util.Scanner;
public class IT26102421Lab5Q1{
 public static void main(String[] args){
	 
 Scanner sc=new Scanner(System.in);
 
 System.out.print("Enter the first number: ");
 int firstnumber= sc.nextInt();
 
 System.out.print("Enter the second number: ");
 int secondnumber= sc.nextInt();
 
 System.out.print("Enter the third number: ");
 int thirdnumber= sc.nextInt();
 
 int largest=firstnumber;
 int smallest=firstnumber;
 
 if (secondnumber>largest){
	 largest=secondnumber;
 }
 if (secondnumber<smallest){
	 smallest=secondnumber;
 }
 if (thirdnumber>largest){
	 largest=thirdnumber;
 }
 if (thirdnumber<smallest){
	 smallest=thirdnumber;
 }
 
 System.out.println("User inputed numbers are: "+ firstnumber +","+ secondnumber +","+ thirdnumber);
 System.out.println("The largest number is: "+ largest);
 System.out.println("The smallest number is: "+ smallest);
 }
}