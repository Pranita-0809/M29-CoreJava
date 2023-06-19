
package tnsif.org.framework;
public abstract class Savingacc extends Bankacc
{
private boolean isSalaried;
static final private float MINBAL=500;
//constructor
public Savingacc(int acno, String accnm, float accbal, boolean isSalaried) {
	super(acno, accnm, accbal);
	this.isSalaried = isSalaried;
}
public void withdraw (float accbal)
{
	System.out.println("acc no"+this.getAcno()+"acc name:"+this.getAccnm()+"acc bal:"+(accbal+MINBAL));
}
@Override
public String toString() {
	return "Savingacc [isSalaried=" + isSalaried + "]";
}

}
