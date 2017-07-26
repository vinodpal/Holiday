/**
 * 
 */
package com.holiday.holiday.model;

public class Cuntry {
	private String name;
	private String id;
	private String discription;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "Cuntry [name=" + name + ", id=" + id + ", discription=" + discription + "]";
	}
	
}
