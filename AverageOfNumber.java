package Basic;

public class AverageOfNumber {

	public static void main(String[] args) {
	
	double arr[]={10,90.78,111,8989,7876};
	System.out.println("Sum of Array number is::"+SumOfNumber(arr));

	}
	public static double SumOfNumber(double arr[])
	{
		double sum=0;
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			avg=sum/5;
		}
		System.out.println("sum"+sum);
		System.out.println("Total Average is::"+avg);
		return sum;
	}

}
