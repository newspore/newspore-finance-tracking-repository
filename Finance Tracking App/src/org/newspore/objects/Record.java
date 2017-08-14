/**
 * 
 */
package org.newspore.objects;

import java.util.Date;

/**
 * @version 1.0
 * @author lestergarcia
 */
public class Record {

	/**
	 * @author lestergarcia
	 * @description Main Class of Record to Be Stored in DB. 
	 */
	private Date creationDate;
	private String businesName;
	private Double price;
	

	public Record () {
	
	}


	public Date getDate() {
		return creationDate;
	}


	public void seDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public String getName() {
		return businesName;
	}


	public void setName(String businesName) {
		this.businesName = businesName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return getName() + " " + getPrice();
	}
	
	
}
