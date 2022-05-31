/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */

package pkg1;

import java.util.Scanner;

public class SumOfCubes {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a value");
	int num=sc.nextInt();//123
	int sum=0;//0
	
	while(num>0)//123>0 true,  12>0 true,   1>0 true,  0>0 false
	{
		int n=num%10;   //123%10=3, 12%10=2,  1%10=1
		
		sum=sum+(n*n*n);   //0+3^3=27, 27+2^3=35,  35+1^3=36
		
		num=num/10;     //123/10=12,  12/10=1,   1/10=0
	}
	System.out.println("Sum of digits cube " + sum);

	}
	


}
