package com.day4.springbootday4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.day4.springbootday4.model.*;


public interface StudentRepo extends JpaRepository<Student,Integer> 
{

}
