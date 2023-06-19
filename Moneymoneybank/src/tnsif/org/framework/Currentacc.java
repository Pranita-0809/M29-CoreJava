package tnsif.org.framework;
public abstract class Currentacc extends Bankacc {
private final float creditlimit;
//constructor
public Currentacc(int acno, String accnm, float accbal, float creditlimit) {
	super(acno, accnm, accbal);
	this.creditlimit = creditlimit;
}
public void withdraw (float accbal)
{
	System.out.println("acc no"+this.getAcno()+"acc name:"+this.getAccnm()+"acc bal:"+this.getAccbal());
}
}
