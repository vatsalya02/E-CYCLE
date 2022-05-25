package com.project.SDP3PROJECT;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name= "Contact_details" )
public class Contact {
	@Column
	private String name;
	@Id
	private String email;
	@Column
	private String subject;
	@Column
	private String message;
	
	public Contact(){
		
	}
	public Contact(String name, String email, String subject, String message) {
		super();
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.message = message;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
