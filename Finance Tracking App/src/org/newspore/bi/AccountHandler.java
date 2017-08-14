package org.newspore.bi;

import org.newspore.objects.BankAccount;

public class AccountHandler {
	private static AccountHandler Ainstance;
	private BankAccount account;
	
	public static AccountHandler getInstance() {
		if(Ainstance==null) {
			Ainstance= new AccountHandler();
		}
		return Ainstance;
	}
	
	public static void setBankAccount(BankAccount account) {
		
	}
	

}
