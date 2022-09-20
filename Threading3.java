package threading;
//Runnable is used when the class has already extended another class
//We do not have the concept of multiple inheritance
//Hence Runnable interface is used 
public class Threading3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Runnable obj=new Runnable()
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
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		};
		//Runnable is a functional interface and has only one method 
		//To run it we need to create and implemet its object by calling the object of runnable
		Runnable obj1=new Runnable()
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
			};
		Thread a=new Thread(obj);
		Thread b=new Thread(obj1);
		
		a.start();
		
		try
		{
			Thread.sleep(500);
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
