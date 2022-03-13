package tns.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	protected float accBal;
	protected float withdrawAmount;
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	
	public float getWithdrawAmount() {
		return withdrawAmount;
	}
	
	public BankAcc(int accNo, String accNm, float accBal,float withdrawAmount ) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
		this.withdrawAmount= withdrawAmount;
	}
	
	public abstract void withdraw(float accBal, float withdrawAmount);
	public void deposite(float accBal) {
		System.out.println(withdrawAmount + "Money deposited " + accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", withdrawAmount=" + withdrawAmount
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getWithdrawAmount()=" + getWithdrawAmount() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}
