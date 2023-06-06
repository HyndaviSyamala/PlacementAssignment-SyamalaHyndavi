import java.util.Scanner;

public class BankingApplication implements BankDetails {

	private String accNo;
	private String name;
	private String accType;
	private long balance;

	Scanner sc = new Scanner(System.in);

	@Override
	public void openAccount(String accNo, String accType, String name, long balance) {

		this.accNo = accNo;

		this.accType = accType;

		this.name = name;

		this.balance = balance;

	}

	public boolean search(String acNo) {
		if (accNo.equals(acNo)) {
			showAccountDetails();
			return (true);
		}
		return (false);
	}

	@Override
	public void showAccountDetails() {
		// TODO Auto-generated method stub

		System.out.println("Name of account holder: " + name);
		System.out.println("Account no.: " + accNo);
		System.out.println("Account type: " + accType);
		System.out.println("Balance: " + balance);

	}

	public long showBalance(String acNo) {
		if (accNo.equals(acNo)) {
			// showAccount();
			// return (true);
			return this.balance;
		} else {
			return (-1);
		}

	}

	@Override
	public void deposit(long amt) {
		// TODO Auto-generated method stub

		balance = balance + amt;
		System.out.println("Balance after Deposite: " + balance);

	}

	@Override
	public void withdrawal(long amt) {
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
		}

	}

}
