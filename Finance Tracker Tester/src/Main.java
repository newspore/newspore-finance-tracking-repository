
import org.newspore.objects.AccountType;
import org.newspore.objects.BankAccount;
import org.newspore.objects.FinanceRecord;

public class Main {

	public static void main(String[] args) {
		FinanceRecord record = new FinanceRecord("Uber", 15.00, bankFactory(), "");
		System.out.println(record.toString());
	
	}
	
	public static BankAccount bankFactory() {
		BankAccount account = new BankAccount(" testAccount", AccountType.CREDIT_CARD);
			return account;
		
	}
	
	

}
