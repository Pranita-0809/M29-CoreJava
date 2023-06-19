package tnsif.org.framework;

public abstract class BankFactory {
abstract public Savingacc getNewSavingAcc(int acNo, String accnm,float accBal, boolean isSalaried);
abstract public Currentacc getNewCurrentAcc(int acNo, String accnm,float accBal,float creditlimit);

}
