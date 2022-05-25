package com.project.SDP3PROJECT;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service("UserVideoService")
@Transactional
public class UserVideoService {
private final UserVideoRepository uservideoRepository;
	
	public UserVideoService(UserVideoRepository uservideoRepository) {
		this.uservideoRepository=uservideoRepository;
	}
	public int uploadvideo(UserVideo v ) {
		if(uservideoRepository.save(v) != null)
			return 1;
		else
			return 0;
		
	}
	/*
	 * public List<Video> getAll() { return UserVideoRepository.findAll(); }
	 */
	public List<UserVideo> getAll() {
		return  uservideoRepository.findAll();
	}
	public List<UserVideo> getAllVideos(String n) {
		return  uservideoRepository.findByEmail(n);
	}

}
