/**
 *wrie a Java program that prompts the user for an integer and then prints out all the 
 *prime numbers up to that Integer?
 */

package pkg1;

import java.util.Scanner;

public class PrimeIntegers {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		
		for(int i=2;i<=num;i++) 
		{
			int count=0;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
		
	}


}
