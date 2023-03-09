package LogicalProgrames;

public class MissingNumber
{
public void funA()
{
System.out.println("funA");
}
	public static void main(String[] args)
	{
      int sum = 0;
      int a[] = {1,2,3,4,5,7,8,9,10};
	//	int arraysize = a.length;
	//	System.out.println(arraysize);

		for(int i=0;i<=a.length;i++)
		{
		//	System.out.println(a[i]);
		int	sum1 = sum+a[i];
	//	System.out.println(sum2);
		
		int b[] ={1,2,3,4,5,6,7,8,9,10};
		for(int j = 0;j<=a.length;j++)
		{
		//	System.out.println(a[j]);
			int sum2 = sum+b[j];
		int	 sum3 = sum2 - sum1;
		System.out.println(sum3);
		}
		}
	}

}
