package com.project.SDP3PROJECT;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service("ContactService")
@Transactional
public class ContactService {
	private final ContactRepository cr ;
	 public ContactService(ContactRepository cr) {
			this.cr=cr;
		}
	 public Contact savedeatils(Contact con) throws IOException {
		    return cr.save(con);
		  }

}
