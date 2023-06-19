package tnsif.org.application;

import tnsif.org.framework.BankFactory;
import tnsif.org.framework.Currentacc;
import tnsif.org.framework.Savingacc;

public class MMBankFactory extends BankFactory {

	@Override
	public Savingacc getNewSavingAcc(int acNo, String accnm, float accBal, boolean isSalaried) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Currentacc getNewCurrentAcc(int acNo, String accnm, float accBal, float creditlimit) {
		// TODO Auto-generated method stub
		return null;
	}

}
