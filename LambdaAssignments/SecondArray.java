package pkg6;

import java.util.Arrays;

interface second{
	public void secondarray(int[]a);
}

public class SecondArray 
{
	public static void main(String[] args)
	{
		int[]arr= {11,29,31,45,5};
		
		second sc=(int[]a)->{
			Arrays.sort(arr);
			System.out.println("Second highest number in a given array:"+arr[arr.length-2]);
		};
		sc.secondarray(arr);
		
	}

}
