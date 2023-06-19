package tnsif.multithreading;
public class ThreadLifeCycleEg extends Thread {
	public void run()
	{
		System.out.println("is thread alive?"this.isAlive());
		int x=0;
		while(x<3)
		{x++;
		System.out.println("x is:"+x);
		}
		try
		{
			sleep(500);
			System.out.println("is thread alive or sleep"+this.isAlive());
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread interrupted...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLifeCycleEg t=new ThreadLifeCycleEg();
		System.out.println("is thread dead or alive"+t.isAlive());
t.start();
	}

}
