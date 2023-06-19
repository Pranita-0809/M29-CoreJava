package tnsif.org.framework;

public abstract class Bankacc {
	private int acno;
	private String accnm;
	private float accbal;
	
	public Bankacc(int acno, String accnm, float accbal) {
		super();
		this.acno = acno;
		this.accnm = accnm;
		this.accbal = accbal;
	}
abstract public void withdraw(float accbal);
public void deposit(float accbal)
{
	System.out.println(accbal);
}
	@Override
	public String toString() {
		return "Bankacc [acno=" + acno + ", accnm=" + accnm + ", accbal=" + accbal + "]";
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	
}