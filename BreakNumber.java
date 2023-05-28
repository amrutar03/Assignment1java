package Basic;

public class BreakNumber {

	public static void main(String[] args) {
		
		int []arr= {12,34,66,85,900};
		System.out.println("the number is"+arr.length);
		for(int i:arr)
		{
			if(i!=85)
			{
				System.out.println(i);
			}
			else {
				break;
			}
		}
	}

}
