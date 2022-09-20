package threading;
class Counter
{
	int count=0;
	public synchronized void increment()
	{
		count++;
	}
}
public class Threading6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Counter b=new Counter();
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					b.increment();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					b.increment();
				}
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		//Both the thread will access the variable at the same time
		//For a particular value 7 both the thread will do the same work
		//And 2 thread will increment it to 8
		//We have to synchronize the thread to make it to thread safe
		
		t1.setName("First");
		t2.setName("Second");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getName());
		System.out.println(t1.getName());
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		System.out.println(t1.isAlive());
		System.out.println("Count"+" "+b.count);
	}

}
