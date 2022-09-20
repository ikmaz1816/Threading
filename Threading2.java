package threading;
class  Hi1 extends Thread
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
class Hello1 extends Thread
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
public class Threading2 {

	public static void main(String[] args) throws Exception{
		Hi1 ob=new Hi1();
		Hello1 ob1=new Hello1();
		
		Thread obj=new Thread(ob);
		obj.start();
		
		Thread obj1=new Thread(ob1);
		obj1.start();
		
		obj.join();
		obj1.join();
		System.out.println("Bye");

	}
	//Threads are used for simultaneous operation 
	//When there are many requests then thread are used to process these requests

}
