import java.util.Scanner;
public class IT26102421Lab5Q2{
 public static void main(String[] args){
 
 Scanner sc=new Scanner(System.in);
 
 System.out.print("The number of new members a customer has introduced: ");
 int no_of_new_members=sc.nextInt();
 
 if (no_of_new_members>=5){
	 System.out.print("Entitled to a headphone");
 }
 else if (no_of_new_members>=4){
	 System.out.print("Entitled to a travelling chair");
 }
 else if (no_of_new_members>=3){
	 System.out.print("Entitled to a travelling bag");
 }
 else if (no_of_new_members>=2){
	 System.out.print("Entitled to a travelling umbrella");
 }
 else if (no_of_new_members>=1){
	 System.out.print("Entitled to a travelling pen");
 }
 else{
	 System.out.print("You are not entitled for a gift");
 }
 }
}