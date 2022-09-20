package threading;
//The class should implement thread
//Thread internally calls run method
//This run method calls the start method 
//So the thread class is extended
class  Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try
			{
				Thread.sleep(500);
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
public class Threading1 {

	public static void main(String[] args) throws Exception {
		Hi obj=new Hi();
		obj.start();
		
		Hello obj1=new Hello();
		obj1.start();
		obj.join();
		obj1.join();
		System.out.println("Bye");
	}
}
