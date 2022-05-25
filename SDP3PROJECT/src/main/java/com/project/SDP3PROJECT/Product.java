package com.project.SDP3PROJECT;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name= "Product" )
public class Product {
	
	@Id
	private String name;
	@Column
	private String email;
	@Column
	private String category;
	@Column
	private String price;
	@Lob
	  private byte[] data;
	private Date createDate;
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Product() {
		
	}
	public Product(String name, String email, String category, String price, byte[] data) {
		super();
		this.name = name;
		this.email = email;
		this.category = category;
		this.price = price;
		this.data = data;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}

	

}
