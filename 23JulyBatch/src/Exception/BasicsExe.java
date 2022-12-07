package Exception;

public class BasicsExe {
	
	static void demo()
	{
		throw new NullPointerException();
	}
   
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Hello");
		
		demo();
		Thread.sleep(2000);
		
		System.out.println("Hi");
	}
 
}
