package tnsif.org.application;
import tnsif.org.framework.Currentacc;
public class MMCurrentAcc extends Currentacc {

	
	public MMCurrentAcc(int acno, String accnm, float accbal, float creditlimit) {
		super(acno, accnm, accbal, creditlimit);
	}
	@Override
	public String toString() {
		return String.format("MMCurrentAcc [toString()=%s]", super.toString());
	}

}
