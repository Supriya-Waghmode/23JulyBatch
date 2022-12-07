package Exception;

public class ETryCatch {

	public static void main(String[] args) {
		
		int a=40;
		int b=0;
		int c=0;
		
		System.out.println("Start");
		
		try {
			c=a/b;
		}
		catch(ArithmeticException s)
		{
			a=60;
			b=2;
			c=a/b;
			System.out.println("Alternative code");
		}
		
		System.out.println(c);
	}
	
}
