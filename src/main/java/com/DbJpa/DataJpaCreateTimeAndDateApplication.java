package com.DbJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.DbJpa.entity.Product;
import com.DbJpa.repo.ProductRepo;

@SpringBootApplication
public class DataJpaCreateTimeAndDateApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(DataJpaCreateTimeAndDateApplication.class, args);
		ProductRepo repo=context.getBean(ProductRepo.class);
		Product p=new Product();
		//p.setPid(101);
		p.setPname("cpu");
		p.setPrice(1200.00);
		repo.save(p);
		
	}

}
