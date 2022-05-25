package com.project.SDP3PROJECT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface UserRepository extends JpaRepository<UserDetails,String> {

	UserDetails findByEmailAndPassword(String email, String password);
	UserDetails findByEmail(String email);

}
