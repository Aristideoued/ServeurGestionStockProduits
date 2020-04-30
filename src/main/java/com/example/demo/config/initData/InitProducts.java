
package com.example.demo.config.initData;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Produit;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.RoleEnum;

@Component
@Order(3)
public class InitProducts implements ApplicationRunner {
	
	private final ProduitRepository produitRepository;
	
	public InitProducts(ProduitRepository produitRepository){
		this.produitRepository=produitRepository;}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("init products....");

	    produitRepository.save(new Produit("Livre",50,20));
	    produitRepository.save(new Produit("Cahiers",200,5.25f));
	    produitRepository.save(new Produit("Stylo",500,2.1f));
	    
	   
	   
		}

	


	


}
