package com.project.SDP3PROJECT;
import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name= "Imagedetails" )
public class Imagedetails {
	@Id
	private String name; 
	@Column
	private String email;
	private String category;
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	private Date createDate;
	private String description;
	@Lob
	  private byte[] data;
	public Imagedetails() {
		
	}
	 
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Imagedetails(String itemname, String email, String category, Date createDate, String description,
			byte[] data) {
		super();
		this.name = itemname;
		this.email = email;
		this.category = category;
		this.createDate = createDate;
		this.description = description;
		this.data = data;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}

}
