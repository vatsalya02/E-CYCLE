package com.project.SDP3PROJECT;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service("ImageService")
@Transactional
public class ProductService {
	private final ProductRepository productrepository ;
	 public ProductService(ProductRepository prorepository) {
			this.productrepository=prorepository;
		}
	 public Product saveproduct(Product pro) throws IOException {
		    return productrepository.save(pro);
		  }
	
}
