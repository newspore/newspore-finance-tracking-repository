package org.newspore.objects;

/* this has to be a Singleton */

public class BankAccount {
	
	private String AccountName;
	private String Owner;
	private Double CurrentBalance;
	private AccountType type;
	
	public BankAccount(String accountName,AccountType type) {
		this.setAccountName(accountName);
		this.setType(type) ;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	public Double getCurrentBalance() {
		return CurrentBalance;
	}

	public void setCurrentBalance(Double currentBalance) {
		CurrentBalance = currentBalance;
	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String owner) {
		Owner = owner;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
	public String toString() {
		return this.getAccountName();
	}

}
