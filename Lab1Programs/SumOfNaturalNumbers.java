package pkg1;

import java.util.Scanner;

public class SumOfNaturalNumbers
{
	static int sum=0;
	public static int calculateSum(int n)
	{
		for(int i=0;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			System.out.println(calculateSum(n));
		
	}
	



}
