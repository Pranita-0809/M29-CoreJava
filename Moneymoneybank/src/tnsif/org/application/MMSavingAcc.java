package tnsif.org.application;

import tnsif.org.framework.Savingacc;

public class MMSavingAcc extends Savingacc {

	public MMSavingAcc(int acno, String accnm, float accbal, boolean isSalaried) {
		super(acno, accnm, accbal, isSalaried);
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc [toString()=%s]", super.toString());
	}

	
	

}
