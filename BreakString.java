package Basic;

public class BreakString {

	public static void main(String[] args) {
		String []sub ={"Java","JavaScript","Selenium","Python","Mukesh"};
		System.out.println("The String length is :"+sub.length);

		for(String i:sub)
		{
			if(i!="Selenium")
			{
				System.out.println(i);
			}
			else {
				break;
			}
		
		}
	}

}
