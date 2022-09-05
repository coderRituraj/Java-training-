
public class FinalStatic {
	private int number;
	private static boolean flag =false;
	private final int div =2;
	public FinalStatic(int number) {
		super();
		this.number = number;
		for(int i=2;i<number/div;i++)
		{

			 if(number % i == 0)
			 {
				 flag = true;
				 break;
						
			 }
		}
		
		if(!flag)
			 System.out.println(number + " is a prime number");
		 else 
			 System.out.println(number + " is not prime ");
	}
	
	

}
