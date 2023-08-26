package com.simplilearn.medicare.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.Customer;
import com.simplilearn.medicare.entity.OrderResponse;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("SELECT new com.simplilearn.medicare.entity.OrderResponse(c.CusId,c.name,c.email, c.mobile, c.address, p.medicineName, p.seller, p.price, p.description, p.quantity, p.orderDateTime) FROM Customer c JOIN c.products p")
	public List<OrderResponse> joinCustomerProductTable();

}
