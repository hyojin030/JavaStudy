package com.itskb.ws03.dto;

public class AccountDto {
	private int accountSeq;
	private String accountNumber;
	private int balance;
	private int userSeq;
	
	public AccountDto() {
	}
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}
	
	public int getAccountSeq() {
		return accountSeq;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public int getUserSeq() {
		return userSeq;
	}
	public void setAccountSeq(int accountSeq) {
		this.accountSeq = accountSeq;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setUserSeq(int userSeq) {
		this.userSeq = userSeq;
	}
	@Override
	public String toString() {
		return "accountSeq="+accountSeq+", accountNumber="+accountNumber+", balance="+balance+", userSeq="+userSeq;
	}
}
