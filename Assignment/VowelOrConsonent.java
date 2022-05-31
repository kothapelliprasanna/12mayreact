package pkg3;
import java.util.Scanner;

public class VowelOrConsonent
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')))
		{
			System.out.println(ch + "is vowel");
		}
		else
		{
			System.out.println("given character is consonent");
		}
	}

}
