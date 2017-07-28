package com.nf.entity;


public class Customer {
	 
	private String name ;
	  
	private String addre;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddre() {
		return addre;
	}

	public void setAddre(String addre) {
		this.addre = addre;
	}

	@Override
	public String toString() {
		return "customer1 [name=" + name + ", addre=" + addre + "]";
	}
	  
	  
}
