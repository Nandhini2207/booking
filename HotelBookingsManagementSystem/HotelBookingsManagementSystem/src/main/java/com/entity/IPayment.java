package com.entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.transaction.Transaction;

import com.fasterxml.jackson.annotation.JsonBackReference;



@Entity
@Table(name="payment")
public class IPayment {
	@Id
	private int pId;
	
	private int bId;
	private int tId;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	ITransaction t;
	
	
	public ITransaction getT() {
		return t;
	}
	public void setT(ITransaction t) {
		this.t = t;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	@Override
	public String toString() {
		return "IPayment [pId=" + pId + ", bId=" + bId + ", tId=" + tId + ", t=" + t + "]";
	}
	
	
	
	
	
	
}
