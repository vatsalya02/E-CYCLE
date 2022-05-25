package com.project.SDP3PROJECT;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface ImageRepository extends JpaRepository<Imagedetails,Long> {
	List<Imagedetails> findByEmail(String email);
	Optional<Imagedetails> findByName(String name);
	List<Imagedetails> findByEmailAndCreateDate(String email, Date createDate);
}


