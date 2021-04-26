package com.laya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laya.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
