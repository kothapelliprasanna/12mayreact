package pkg3;

public class LargestNumber 
{
	public static void main(String[] args)
	{
		
	   int[] Arr =new int[] {5, 1, 105, 70, 225, 230, 135};
	   {
		   int max=Arr[0];
		   
		   for(int i=0;i<Arr.length;i++)
		   {
			   if(Arr[i]>max)
				   max=Arr[i];
		   }
			System.out.println("Largest number present in given array " +  max); 

		   
	   }
		
	}

}
