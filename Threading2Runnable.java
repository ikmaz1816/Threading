package threading;

class  Hi2 implements Runnable
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
class Hello2 implements Runnable
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
public class Threading2Runnable {

	public static void main(String[] args) throws Exception{
		Runnable ob=new Hi1();
		Runnable ob1=new Hello1();
		//Dynamic Method dispatch
		//Sometimes different class can be extended hence we cannot extend the Thread class
		//Hence we implement the runnable and use Thread objects to execute the programs
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


