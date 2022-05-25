package com.project.SDP3PROJECT;
import javax.persistence.*;

@Entity
@Table(name= "Checkout_details" )
public class Checkout {
	@Id
	private String email; 
	@Column
	private String fname;
	@Column
	private String lname;
	@Column
	private String country;
	@Column
	private String address;
	@Column
	private String comment;
	@Column
	private String city;
	@Column
	private int zipcode;
	@Column
	private long phno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Checkout() {
		
	}
	public Checkout(String email, String fname, String lname, String country, String address, String comment,
			String city, int zipcode, long phno) {
		super();
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.country = country;
		this.address = address;
		this.comment = comment;
		this.city = city;
		this.zipcode = zipcode;
		this.phno = phno;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	

}
