package org.tnsif.client;

import tnsif.org.application.MMBankFactory;
import tnsif.org.application.MMCurrentAcc;
import tnsif.org.application.MMSavingAcc;
import tnsif.org.framework.BankFactory;
import tnsif.org.framework.Currentacc;
import tnsif.org.framework.Savingacc;

//Driver class
		/*program to demonstrate on MMbankingapp*/
public class MMBankingApplicationClient {

	public static void main(String[] args) {
		BankFactory s=new MMBankFactory();
		Savingacc p=new MMSavingAcc(12,"neha",6000,true);
		Currentacc n=new MMCurrentAcc(14,"Jagdish",7000,900);
		System.out.println(" Saving acc");
		p.withdraw(p.getAccbal());
		System.out.println(" cureent acc");
		n.withdraw(n.getAccbal());
		System.out.println(p);
		System.out.println(n);
	}

}
