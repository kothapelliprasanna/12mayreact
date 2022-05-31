/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1.
 *  Every subsequent value is the sum of the 2 values preceding it.
 *   Write a Java program that uses both recursive and non-recursive functions 
 *   to print the nth value of the Fibonacci sequence?
 */




package pkg1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the fibonacci series");
		int num=sc.nextInt();
		
		int a=1;
		int b=1;
		
		System.out.println("\n list of fibonacci series of"+num+ "elements is as below");
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<num;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
	}


}
