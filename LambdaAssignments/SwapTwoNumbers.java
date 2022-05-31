package pkg6;

import java.util.Scanner;

interface Swap
{
	public void swap(int x,int y);
}

public class SwapTwoNumbers
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int i1=sc.nextInt();
		System.out.println("enter the second number");
		int i2=sc.nextInt();
		
		System.out.println("after swapping");
		
		Swap Swap=(int x,int y)->
		{
			int temp=x;
			x=y;
			y=temp;
			System.out.println("1st number "+x);
			System.out.println("2nd number "+y);
		};
		Swap.swap(i1, i2);
		
		
	}
	

}
