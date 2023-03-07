package java0307;

public class AccountDto {
	private int accountSeq, balance, userSeq;
	private String accountNumber;
	
	public AccountDto() {}

	public AccountDto(int accountSeq, int balance, int userSeq, String accountNumber) {
		super();
		this.accountSeq = accountSeq;
		this.balance = balance;
		this.userSeq = userSeq;
		this.accountNumber = accountNumber;
	}

	public int getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getUserSeq() {
		return userSeq;
	}

	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "AccountDto [accountSeq=" + accountSeq + ", balance=" + balance + ", userSeq=" + userSeq
				+ ", accountNumber=" + accountNumber + "]";
	}
	
	
}
