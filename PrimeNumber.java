package Basic;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int i=2;i<1000;i++) 
		{
		   boolean check=true;
		   for(int j=2;j<i;j++)
		   {
			   if(i%j==0)
			   {
				   check=false;
				   break;
				   
			   }
			   
		   }
		   if(check==true)
		   {
			   System.out.println(i);
		   }
		}

	}

}
