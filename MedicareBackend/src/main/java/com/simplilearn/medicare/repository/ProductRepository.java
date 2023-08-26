package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
