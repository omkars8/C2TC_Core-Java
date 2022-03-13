package tns.application;

import tns.framework.BankFactory;
import tns.framework.CurrentAcc;
import tns.framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

@Override
public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried, float withdrawAmount) {
	MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal,isSalaried,withdrawAmount);
	return mmsaving;
}

@Override
public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit, float withdrawAmount) {
	MMCurrentAcc mmcurrent=new MMCurrentAcc(AccNo, accNm, accBal, creditLimit, withdrawAmount);
	return mmcurrent;
}





}


