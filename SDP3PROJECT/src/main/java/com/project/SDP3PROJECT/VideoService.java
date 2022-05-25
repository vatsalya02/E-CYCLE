package com.project.SDP3PROJECT;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service("VideoService")
@Transactional
public class VideoService {
private final VideoRepository videorepository;
	
	public VideoService(VideoRepository videorepository) {
		this.videorepository=videorepository;
	}
	public int uploadvideo(Video v ) {
		if(videorepository.save(v) != null)
			return 1;
		else
			return 0;
		
	}
	public List<Video> getAll() {
		return  videorepository.findAll();
	}
	
	

}
