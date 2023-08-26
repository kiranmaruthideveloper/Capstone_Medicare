package com.simplilearn.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.medicare.entity.AdminCredential;

@Repository
public interface AdminCredentialRepository extends JpaRepository<AdminCredential, Integer>{

}
