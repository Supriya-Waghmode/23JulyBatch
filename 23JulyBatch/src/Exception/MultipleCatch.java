package Exception;

public class MultipleCatch {

	public static void main(String[] args) {
		
		int a=30;
		int b=0;
		int c=0;
		
		int d[]= {34,89,67,54};
		
		System.out.println("Start");
		
		try {
			c=a/b;
			System.out.println(d[4]);
		}
		
		catch(ArrayIndexOutOfBoundsException s) {
			
			System.out.println("Alternative code");
			System.out.println(d[3]);
		}
		
		catch(ArithmeticException s)
		{
			b=2;
			c=a/b;
		}
		
		System.out.println(c);
		System.out.println("Normal flow");
	}
	
	
}
