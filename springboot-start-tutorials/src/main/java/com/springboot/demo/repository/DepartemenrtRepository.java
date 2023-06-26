package com.springboot.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.model.Department;


@Repository
public interface DepartemenrtRepository extends JpaRepository <Department, Long> {
    
}
