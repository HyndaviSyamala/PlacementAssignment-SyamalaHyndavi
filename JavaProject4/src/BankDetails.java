
public interface BankDetails {

	public void openAccount(String accNo, String accType, String name, long balance);

	void deposit(long amt);

	void withdrawal(long amt);

	void showAccountDetails();

	public long showBalance(String acNo);

	public boolean search(String acNo);

}
