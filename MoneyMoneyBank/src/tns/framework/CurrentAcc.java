package tns.framework;

public abstract class CurrentAcc extends BankAcc {

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit, float withdrawAmt) {
		super(accNo, accNm, accBal, creditLimit);
		this.creditLimit = creditLimit;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	private final float  creditLimit;
	public  void withdraw(float creditLimit, float withdrawAmount) {
		if(accBal > creditLimit) {
			System.out.println("can not withdraw.");
		}
		else if(accBal> creditLimit && creditLimit > (accBal - withdrawAmount)) {
			this.accBal = this.accBal - this.withdrawAmount;
			System.out.println("Amount withdrawn. Your acoount balance is :" +accBal);
		}
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accBal=" + accBal + ", withdrawAmt=" + withdrawAmount
				+ ", getCreditLimit()=" + getCreditLimit() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getWithdrawAmount()=" + getWithdrawAmount() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}

