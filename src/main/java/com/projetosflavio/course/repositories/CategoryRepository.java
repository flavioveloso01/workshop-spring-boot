package com.projetosflavio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosflavio.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
