package com.project.SDP3PROJECT;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
@Repository
public interface UserVideoRepository extends JpaRepository<UserVideo,String>
{

	List<UserVideo> findByEmail(String n);

	
}
