package org.newspore.objects;

public class Subcategory {
	private Category parent;
	private String name;
	
	public Subcategory(Category parent, String name) {
		this.parent = parent;
		this.name = name;
	}
	
	public String ToString() {
		return this.name;
	}
	public String getCategory() {
		return parent.toString();
	}

}
