package week1.day1.assignments;

public class isPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		
		for (int i=2;i<n-1;i++)
		{
			if(i/n-1==0)
			{
				System.out.println("not number");
				break;
			}
			else
			{
				System.out.println(" prime");
				break;
			}
		}
		
		
		

	}

}
