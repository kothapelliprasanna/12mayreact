package pkg1;

import java.util.Scanner;

public class CheckNumberIncreasingOrNot 
{
	static boolean checkNumber(int n)
	{
		String check=String.valueOf(n);
		int length=check.length();
		for(int i=0;i<length-1;i++)
		{
			if(check.charAt(i)<=check.charAt(i+1))
			{
				continue;
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}



}
