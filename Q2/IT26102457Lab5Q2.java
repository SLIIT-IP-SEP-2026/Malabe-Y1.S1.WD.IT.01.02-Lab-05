import java.util.Scanner;
public class IT26102457Lab5Q2
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		int newmember;
		
		System.out.print("Enter the number of the new member introduced :");
		newmember=input.nextInt();
		
		
		
switch (newmember) {
    case 0:
        System.out.print("No prize");
        break;

    case 1:
        System.out.print("Prize is: Pen");
        break;

    case 2:
        System.out.print("Prize is: Umbrella");
        break;

    case 3:
        System.out.print("Prize is: Bag");
        break;

    case 4:
        System.out.print("Prize is: Travelling Chair");
        break;

    default:
        if (newmember < 0) {
            System.out.print("Input must be 0 or greater");
        } else {
            System.out.print("Prize is: Headphone");
        }
        break;
}

	}
}