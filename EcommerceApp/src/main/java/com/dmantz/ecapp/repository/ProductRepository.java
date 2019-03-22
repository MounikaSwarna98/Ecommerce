package com.dmantz.ecapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dmantz.ecapp.request.ProductRO;

@Repository
public interface ProductRepository extends JpaRepository<ProductRO,Integer> {
	

}
