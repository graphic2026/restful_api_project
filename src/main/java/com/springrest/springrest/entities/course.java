package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class course {
	
	@Id
	private long iD;
	private String firstname;
	private String lastnaame;
	private String email;
	private long   phoneNumber;
	private String organizationName;
	private String organizationAddress;
	private long   password;
	public course(long iD, String firstname, String lastnaame, String email, long phoneNumber, String organizationName,
			String organizationAddress, long password) {
		super();
		this.iD = iD;
		this.firstname = firstname;
		this.lastnaame = lastnaame;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.organizationName = organizationName;
		this.organizationAddress = organizationAddress;
		this.password = password;
	}
	public course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getiD() {
		return iD;
	}
	public void setiD(long iD) {
		this.iD = iD;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastnaame() {
		return lastnaame;
	}
	public void setLastnaame(String lastnaame) {
		this.lastnaame = lastnaame;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationAddress() {
		return organizationAddress;
	}
	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "course [iD=" + iD + ", firstname=" + firstname + ", lastnaame=" + lastnaame + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", organizationName=" + organizationName + ", organizationAddress="
				+ organizationAddress + ", password=" + password + "]";
	}
	

}
