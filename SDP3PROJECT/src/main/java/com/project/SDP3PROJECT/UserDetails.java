package com.project.SDP3PROJECT;
import javax.persistence.*;

@Entity
@Table(name= "Customers" )
public class UserDetails {
	@Id
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="cpassword")
	private String cpassword;
	@Column(name="name")
	private String name;
public UserDetails() {
		
	}
	public UserDetails(String name, String email, String password, String cpassword) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.cpassword = password;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	
}
