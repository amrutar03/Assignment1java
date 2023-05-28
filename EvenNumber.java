package Basic;

public class EvenNumber {

	public static void main(String[] args) {
		int num=200;
		System.out.println("The list of even number is 1 to"+num+":");
	
		for(int i=1;i<=num;i++)
		{
		  if(i%2==0)
		  {
			  System.out.println("number is even:"+i);
	       }
		  }
	}

}
