package com.project.SDP3PROJECT;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import java.nio.file.*;
 
import org.springframework.web.multipart.MultipartFile;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service("UserService")
@Transactional
public class UserService {
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	
	
	public int saveMyUser(UserDetails user ) {
		if(userRepository.save(user) != null)
			return 1;
		else
			return 0;
		
	}
	public int  updateUser(String email,String password) {
		UserDetails  updateuser =userRepository.findByEmail(email);
        updateuser.setPassword(password);
        updateuser.setCpassword(password);
        if(userRepository.save(updateuser) != null)
        		return 1;
        else
        		return 0;
    }

	public UserDetails findByEmailAndPassword(String email, String password) {
		return  userRepository.findByEmailAndPassword(email, password);
	}
	public UserDetails findByEmail(String email) {
		return  userRepository.findByEmail(email);
	}
	public  List<UserDetails> getAllUsers() {
			return  userRepository.findAll();
	}



	
}