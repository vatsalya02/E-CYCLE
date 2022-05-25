package com.project.SDP3PROJECT;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name= "videos")
public class UserVideo {
	@Id
	private String name;
	@Column
	private String category;
	private String url;
	private String email;
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
