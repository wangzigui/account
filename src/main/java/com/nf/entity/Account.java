package com.nf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Account")
public class Account {
	
	  @Id
	  @GeneratedValue
	  @Column(name = "id")
	  private int id ;
	  
	  @Column(name = "name")
	  private String name ;
	  
	  @Column(name = "money")
	  private double money;
	  
	  @Column(name = "addre")
	  private String addre;
	  
	  public Account(){}
	  
	  public Account(String name,double money )
	  {
		  this.name = name;
		  this.money = money;
	  }
	  
	  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", money=" + money + ", name=" + name
				+ "]";
	}

	 
}
