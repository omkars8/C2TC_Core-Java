package tns.application;

import tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit, float withdrawAmount) {
		super(accNo, accNm, accBal, creditLimit,withdrawAmount);
		
	}
	@Override
	public void withdraw( float creditLimit, float withdrawAmt) {
		if(accBal < creditLimit) {
			System.out.println("Can not withdraw.");
		}
		else if(accBal> creditLimit && creditLimit > (accBal - withdrawAmount)) {
			this.accBal = this.accBal - this.withdrawAmount;
			System.out.println("Amount withdrawn . Your acoount balance is :" +accBal);
		}
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [accBal=" + accBal + ", withdrawAmount=" + withdrawAmount + ", getCreditLimit()="
				+ getCreditLimit() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getWithdrawAmount()=" + getWithdrawAmount()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}


