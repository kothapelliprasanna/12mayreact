package pkg6;

import java.util.Scanner;
@FunctionalInterface
interface naturaln
{
	int sum(int n);
}
public class NaturalNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		
		naturaln n1=(int n)->
		{
			return n*(n+1)/2;
		};
		System.out.println("The sum of "+n1+ "natural numbers ");
		System.out.println(n1.sum(i));
		
	}

}
