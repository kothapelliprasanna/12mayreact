package pkg3;

public class EmployeIndex 
{
	long empId;
	String empName;
	int empAge;
	EmployeIndex(int id,String name,int age)
	{
		this.empId=id;
		this.empName=name;
		this.empAge=age;
	}
	public static void main(String[] args)
	{
		EmployeIndex emp1=new EmployeIndex(10,"ram",23);
		EmployeIndex emp2=new EmployeIndex(10,"prasu",23);
		EmployeIndex emp3=new EmployeIndex(10,"pk",50);
		EmployeIndex[] empArr=new EmployeIndex[6];
		for(int i=0;i<empArr.length;i++)
		{
			System.out.println(i);
		}
		empArr[0]=emp1;
		empArr[2]=emp2;
		empArr[4]=emp3;
		System.out.println();
		for(int i=0;i<empArr.length;i++)
		{
			if(!(empArr[i] instanceof EmployeIndex))
			{
				System.out.println(i);
			}
		}




	}
	


}
