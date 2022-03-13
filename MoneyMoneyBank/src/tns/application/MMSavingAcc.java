package tns.application;

import tns.framework.SavingAcc;


public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL=500;
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried, float withdrawAmount) {
		super(accNo, accNm, accBal,withdrawAmount);
	
	}

	@Override
	public void withdraw(float accBal, float withdrawAmount) 
	
	{
		if(accBal < MINBAL) {
			System.out.println("Can not withdraw");
		}
		else if(accBal> MINBAL) {
			this.accBal = this.accBal - this.withdrawAmount;
			System.out.println(withdrawAmount +" amount withdrawn . Your acoount balance is :" +this.accBal);
		}
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accBal=" + accBal + ", withdrawAmount=" + withdrawAmount + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getWithdrawAmount()=" + getWithdrawAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
}
