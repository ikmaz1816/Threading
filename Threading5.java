package threading;

public class Threading5 {

	public static void main(String[] args) throws Exception{
		
		//Runnable is a functional interface and has only one method 
		//To run it we need to create and implemet its object by calling the object of runnable
		Thread a=new Thread(()->
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
		});
		Thread b=new Thread(()->
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Hi");
				try
				{
					Thread.sleep(500);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			});

		a.start();

		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		b.start();

		a.join();
		
		b.join();

		System.out.println("Bye");
		}

	}

