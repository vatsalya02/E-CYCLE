package com.project.SDP3PROJECT;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service("ContactServices")
@Transactional
public class CheckOutService {
	private final CheckoutRepository cr ;
	 public CheckOutService(CheckoutRepository cr) {
			this.cr=cr;
		}
	 public Checkout savepayment(Checkout model) throws IOException {
		    return cr.save(model);
		  }

}
