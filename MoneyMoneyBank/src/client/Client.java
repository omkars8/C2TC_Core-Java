package client;
import tns.application.MMBankFactory;
import tns.application.MMCurrentAcc;
import tns.application.MMSavingAcc;
import tns.framework.BankFactory;
import tns.framework.CurrentAcc;
import tns.framework.SavingAcc;

public class Client {
	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(1,"sid",5000,true,1000);
		sa.withdraw(sa.getAccBal(), sa.getWithdrawAmount());
		sa.toString();
		CurrentAcc ca =new MMCurrentAcc(2,"harry",4000,5000,300);
		ca.withdraw(ca.getCreditLimit(),ca.getWithdrawAmount());
		ca.toString();
	}
}