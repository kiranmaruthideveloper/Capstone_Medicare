package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.ProductList;

@Repository
public interface ProductListRepository extends JpaRepository<ProductList, Integer>{

}
