package com.restuarant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Supervisor implements EntityInterface{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sId;
	
	
	@Column(nullable = false)
	private String sEmail;
	
	@Column(nullable = false)
	private String sPassword;
	
	@Column(nullable = false)
	private String sName;
	
	@Column(nullable = false)
	private String sPhone;

	public Supervisor(int sId, String sEmail, String sPassword, String sName, String sPhone) {
		super();
		this.sId = sId;
		this.sEmail = sEmail;
		this.sPassword = sPassword;
		this.sName = sName;
		this.sPhone = sPhone;
	}

	public Supervisor() {
		super();
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	@Override
	public String toString() {
		return "Supervisor [sId=" + sId + ", sEmail=" + sEmail + ", sPassword=" + sPassword + ", sName=" + sName
				+ ", sPhone=" + sPhone + "]";
	}
	
	
	
}
