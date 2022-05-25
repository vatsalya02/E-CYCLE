package com.project.SDP3PROJECT;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.util.StringUtils;
import java.util.List;
import java.util.Optional;
import java.io.*;

import java.nio.file.*;
 
import org.springframework.web.multipart.MultipartFile;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service("ImageServices")
@Transactional
public class ImageService {
	 private final ImageRepository imagerepository ;
	 public ImageService(ImageRepository imagerepository) {
			this.imagerepository=imagerepository;
		}
	public Imagedetails store(Imagedetails image) throws IOException {
	    return imagerepository.save(image);
	  }
	public List<Imagedetails> getAllItems(String email) {
		return  imagerepository.findByEmail(email);
	}
	public Optional<Imagedetails> findByName(String itemname) {
		return  imagerepository.findByName(itemname);
	}
	public List<Imagedetails> getAllItemsAccDate(String email, Date createDate) {
		return  imagerepository.findByEmailAndCreateDate(email,createDate);
	}
	public  List<Imagedetails> getAll() {
		return  imagerepository.findAll();
}
}
