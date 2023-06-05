package com.restuarant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class Orders {
	@Id
	private Integer oId;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Item.class)
	@JoinColumn(name="iId")
	private Item item;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
	@JoinColumn(name="cId")
	private Customer customer;
	
	@Column(nullable = false)
	private String paymentmode;
	
	@Column(nullable = false)
	private int orderstatus;

	public Orders(Integer oId, Item item, Customer customer, String paymentmode, int orderstatus) {
		super();
		this.oId = oId;
		this.item = item;
		this.customer = customer;
		this.paymentmode = paymentmode;
		this.orderstatus = orderstatus;
	}

	public Orders() {
		super();
	}

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public int getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(int orderstatus) {
		this.orderstatus = orderstatus;
	}

	@Override
	public String toString() {
		return "Orders [oId=" + oId + ", item=" + item + ", customer=" + customer + ", paymentmode=" + paymentmode
				+ ", orderstatus=" + orderstatus + "]";
	}

}
