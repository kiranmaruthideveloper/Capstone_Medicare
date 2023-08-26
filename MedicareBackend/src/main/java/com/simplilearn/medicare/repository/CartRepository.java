package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
