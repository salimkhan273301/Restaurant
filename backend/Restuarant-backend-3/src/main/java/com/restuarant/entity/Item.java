package com.restuarant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iId;
	
	@Column(nullable = false)
	private String iName;
	
	@Column(nullable = false)
	private String iDesc;
	
	@Column(nullable = false)
	private float iCost;
	
	@Column(nullable = false)
	private int icount;
	
	//For checking item is Available or not
	@Column(nullable=false)
	private Boolean status;

	public Item(Integer iId, String iName, String iDesc, float iCost, int icount, Boolean status) {
		super();
		this.iId = iId;
		this.iName = iName;
		this.iDesc = iDesc;
		this.iCost = iCost;
		this.icount = icount;
		this.status = status;
	}

	public Item() {
		super();
	}

	public Integer getiId() {
		return iId;
	}

	public void setiId(Integer iId) {
		this.iId = iId;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public String getiDesc() {
		return iDesc;
	}

	public void setiDesc(String iDesc) {
		this.iDesc = iDesc;
	}

	public float getiCost() {
		return iCost;
	}

	public void setiCost(float iCost) {
		this.iCost = iCost;
	}

	public int getIcount() {
		return icount;
	}

	public void setIcount(int icount) {
		this.icount = icount;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Item [iId=" + iId + ", iName=" + iName + ", iDesc=" + iDesc + ", iCost=" + iCost + ", icount=" + icount
				+ ", status=" + status + "]";
	}
	
//	@ManyToOne(cascade = CascadeType.ALL,targetEntity = Customer.class)
//	private Customer customer;
	
//	@Lob
//	private byte[] picByte;
//	
//	private String iftype;
//	private String ift;

	
	
	
}