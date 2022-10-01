package com.entity;


import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="transaction")
public class ITransaction {

	@Id
	private int tId;
	
	private double amount;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonBackReference
    IPayment p;
	
	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	public IPayment getP() {
		return p;
	}

	public void setP(IPayment p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "ITransaction [tId=" + tId + ", amount=" + amount + ", p=" + p + "]";
	}

	
}
