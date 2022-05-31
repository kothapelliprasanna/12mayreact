package pkg1;

import java.util.Scanner;

public class SumOfSquares {
	static int sum=0;
	static int square_sum=0;
	public static int calculateDiffrence(int n)
	{
		for(int i=0;i<n;i++)
		{
			sum=sum+i;
			square_sum=square_sum+i*i;
		}
		return square_sum=square_sum;

	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(calculateDiffrence(n));
		
	}


}
