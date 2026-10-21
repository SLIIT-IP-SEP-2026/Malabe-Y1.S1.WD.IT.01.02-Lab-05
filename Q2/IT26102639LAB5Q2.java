import java.util.Scanner;
public class IT26102639LAB5Q2{
     public static void main(String[] args){
		 
     Scanner input = new Scanner(System.in);

     int newMembers;
	 
     System.out.print("Enter the number of new members introduced:");
	 newMembers = input.nextInt();
	 
	 if (newMembers <0){
		 System.out.println("invalide number of new members");
		 return;
	 }
	 
	 
	 switch(newMembers)
	 {
		case 0 :
		  System.out.print("Prize:No prize");
		          break;
		case 1 :
		  System.out.print("Prize:Pen");
		          break;
		case 2 :
		   System.out.print("Prize:umbrella");
		          break;
		case 3 :
		  System.out.print("Prize:bag");
		          break;		  
		 case 4 :
		   System.out.print("Prize:Travelling Chair");
		          break;
		default:
		  System.out.print("Prize:Headphone");
	 	  
				  
		 
	 }

       }
    }