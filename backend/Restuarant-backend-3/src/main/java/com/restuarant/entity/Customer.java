package com.restuarant.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table

public class Customer implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer cId;
	
	@Column(nullable = false)
	private String cEmail;
	
	@Column(nullable = false)
	private String cPassword;
	
	@Column(nullable = false)
	private String cName;
	
	@Column(nullable = false)
	private String cPhone;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Item.class)
	private List<Item> items;
	
	
	

	public Customer(Integer cId, String cEmail, String cPassword, String cName, String cPhone, List<Item> items) {
		super();
		this.cId = cId;
		this.cEmail = cEmail;
		this.cPassword = cPassword;
		this.cName = cName;
		this.cPhone = cPhone;
		this.items = items;
	}
	

	public Customer() {
		super();
	}


	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcEmail() {
		return cEmail;
	}

	public void setcEmail(String cEmail) {
		this.cEmail = cEmail;
	}

	public String getcPassword() {
		return cPassword;
	}

	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcPhone() {
		return cPhone;
	}

	public void setcPhone(String cPhone) {
		this.cPhone = cPhone;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}


	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cEmail=" + cEmail + ", cPassword=" + cPassword + ", cName=" + cName
				+ ", cPhone=" + cPhone + ", items=" + items + "]";
	}
	
	
	
}