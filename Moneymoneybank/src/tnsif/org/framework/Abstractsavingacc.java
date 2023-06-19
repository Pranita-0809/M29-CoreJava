


package tnsif.org.framework;
public abstract class Abstractsavingacc extends Bankacc
{
private boolean isSalaried;
static final private float MINBAL=0;
//constructor
public Abstractsavingacc(int acno, String accnm, float accbal, boolean isSalaried) {
	super(acno, accnm, accbal);
	this.isSalaried = isSalaried;
}
public void withdraw float(accbal)
{
	System.out.println("acc no"+this.getacno)
}

}
