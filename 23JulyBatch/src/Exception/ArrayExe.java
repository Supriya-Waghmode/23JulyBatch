package Exception;

public class ArrayExe {
	
	public static void main(String[] args) {
		
		int a=30;
		int b=2;
		int c=40;
		
		int d[]= {34,89,67,54};
		
		System.out.println("Start");
		
		try {
			c=a/b;
			System.out.println(d[2]);
		}
		
		catch(ArrayIndexOutOfBoundsException s) {
			System.out.println(d[3]);
			System.out.println("Alternative code");
		}
		
		
		System.out.println(c);
		System.out.println("Normal flow");
	}
	
	    // {when the exception is occured and not get handled
	   //  that time we use try block.}

	  // And when exception is occured and get handled then that time we use
	  // try => catch=>normal flow
	
	   // And when exception is not occured 
	   // then try=> normal flow.
	
}
