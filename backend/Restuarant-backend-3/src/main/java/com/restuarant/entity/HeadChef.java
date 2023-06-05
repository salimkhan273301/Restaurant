package com.restuarant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class HeadChef implements EntityInterface {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cId;
	
	@Column(nullable = false)
	private String cEmail;
	
	@Column(nullable = false)
	private String cPassword;
	
	@Column(nullable = false)
	private String cName;
	
	@Column(nullable = false)
	private String cPhone;

	public HeadChef(Integer cId, String cEmail, String cPassword, String cName, String cPhone) {
		super();
		this.cId = cId;
		this.cEmail = cEmail;
		this.cPassword = cPassword;
		this.cName = cName;
		this.cPhone = cPhone;
	}

	public HeadChef() {
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

	@Override
	public String toString() {
		return "HeadChef [cId=" + cId + ", cEmail=" + cEmail + ", cPassword=" + cPassword + ", cName=" + cName
				+ ", cPhone=" + cPhone + "]";
	}

	
	
}
