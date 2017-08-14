package org.newspore.objects;

public class FinanceRecord extends Record {
	private Category Category;
	private Subcategory SubCategory;
	private BankAccount bank;
	private String comment;
	
	public FinanceRecord(String name,Double price,BankAccount account, String comment) {
		super.setName(name);
		super.setPrice(price);
		this.setAccount(account);
		this.setComment(comment);
	}

	public String getAccount() {
		return bank.toString();
	}

	public void setAccount(BankAccount bank) {
		this.bank = bank;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Subcategory getSubCategory() {
		return SubCategory;
	}

	public void setSubCategory(Subcategory subCategory) {
		SubCategory = subCategory;
	}

	public Category getCategory() {
		return Category;
	}

	public void setCategory(Category category) {
		Category = category;
	}
	
	public String toString() {
		return getName()+" "+getPrice()+" "+ getAccount();
		
	}

}
