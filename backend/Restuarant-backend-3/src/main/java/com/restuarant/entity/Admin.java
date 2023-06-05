package com.restuarant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Admin implements EntityInterface {
	
	

		@Id
		@GeneratedValue
		private int id;
		private String aEmail;
		private String aPassword;
		private String aName;
		private String aPhone;
		public Admin(int id, String aEmail, String aPassword, String aName, String aPhone) {
			super();
			this.id = id;
			this.aEmail = aEmail;
			this.aPassword = aPassword;
			this.aName = aName;
			this.aPhone = aPhone;
		}
		public Admin() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getaEmail() {
			return aEmail;
		}
		public void setaEmail(String aEmail) {
			this.aEmail = aEmail;
		}
		public String getaPassword() {
			return aPassword;
		}
		public void setaPassword(String aPassword) {
			this.aPassword = aPassword;
		}
		public String getaName() {
			return aName;
		}
		public void setaName(String aName) {
			this.aName = aName;
		}
		public String getaPhone() {
			return aPhone;
		}
		public void setaPhone(String aPhone) {
			this.aPhone = aPhone;
		}
		@Override
		public String toString() {
			return "Admin [id=" + id + ", aEmail=" + aEmail + ", aPassword=" + aPassword + ", aName=" + aName
					+ ", aPhone=" + aPhone + "]";
		}
	
		

}
