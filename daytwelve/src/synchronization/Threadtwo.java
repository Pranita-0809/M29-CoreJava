package synchronization;

public class Threadtwo {
	Power p;

	public Threadtwo(Power p) {
		super();
		this.p = p;
	}
		public void run()
		{
			p.printPower(56);
		}
	}
	

