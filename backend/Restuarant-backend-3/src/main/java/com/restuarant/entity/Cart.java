package com.restuarant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class Cart implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	
	//@JoinColumn(name="cEmail")
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
	@JoinColumn(name="cId")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Item.class)
	@JoinColumn(name="iId")
	private Item item;
	
	@Column(nullable = false)
	private Integer iQty;

	public Cart(int cartId, Customer customer, Item item, Integer iQty) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.item = item;
		this.iQty = iQty;
	}

	public Cart() {
		super();
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getiQty() {
		return iQty;
	}

	public void setiQty(Integer iQty) {
		this.iQty = iQty;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customer=" + customer + ", item=" + item + ", iQty=" + iQty + "]";
	}
	

}