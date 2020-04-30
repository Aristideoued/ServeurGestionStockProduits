package com.example.demo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;



@RestController
@RequestMapping("/api/product")
@CrossOrigin
public class ProduitController extends CrudController<Produit,Long>{
	

}
