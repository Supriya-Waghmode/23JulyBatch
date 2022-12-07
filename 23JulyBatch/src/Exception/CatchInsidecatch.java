package Exception;

public class CatchInsidecatch {

	
	public static void main(String[] args) {
		
		int a=20;
		int b=0;
		int c=0;
		
		int d[]= {34,22,12,67};
		
		System.out.println("Start");
		
		try {
			
			System.out.println(d[5]);
			c=a/b;
		}
		
		catch(ArithmeticException s)
		{
			System.out.println("Catch Arithmetic Exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch array index out of bound exception");
		}
		
		try {
			c=a/b;
			
		}
		catch(ArithmeticException s)
		{
			System.out.println("Arithmetic exception");
		}
	}

}