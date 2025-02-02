package com.projetosflavio.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosflavio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
