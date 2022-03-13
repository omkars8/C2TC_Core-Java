package tns.framework;

public abstract class BankFactory {

public abstract SavingAcc getNewSavingAccount(int accNo,String accNm, float accBal,boolean isSalary,float withdrawAmount);
	
public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal,float creditLimit,float withdrawAmount);
	
		
	
}
