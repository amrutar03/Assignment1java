package Basic;

public class StudMarks {

	public static void main(String[] args) {
		
		int marks[]= { 78,12,89,55,35};

		System.out.println("This is number of student marks"+marks.length);
		for(int i:marks)
		{
			if(i>80)
			{
				System.out.println(i);
			}
		}
		
		
	}

}
