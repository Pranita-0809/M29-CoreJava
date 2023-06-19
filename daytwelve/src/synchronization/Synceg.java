package synchronization;

public class Synceg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Power obj=new Power();
Threadone t1=new Threadone(obj);
Threadtwo t2=new Threadtwo(obj);
t1.start();
t2.start();
	}

}
