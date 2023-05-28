package Basic;

public class SumOFArray {

	

	 static double sumOfArray(double arr[]) 
	{
		double sum=0;
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Sum of array number is:"+i);
			sum=sum+arr[i];
			System.out.println("Sum "+sum);
		}
		
		System.out.println("Sum "+sum);
		return sum;
	}
	 public static void main(String[] args) {
			
			double arr[]= {10,90.78,111,8989,7876};
			System.out.println("Sum of 5 number is::"+sumOfArray(arr));

		}
	
	
	
}
