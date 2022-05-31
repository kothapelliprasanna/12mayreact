package pkg3;
import java.util.Scanner;

public class SwapTwoNumbers 
{
	public static void main(String[]args)
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X ");
		x=sc.nextInt();
		System.out.println("Enter the value of  Y");

		y=sc.nextInt();
		
		System.out.println("before swapping "+ x +" "+y);
	

	      z=x;
	      x=y;
	      y=z;
	    System.out.println("After swapping  "+ x + " "+y);
	    
	}
	
}
