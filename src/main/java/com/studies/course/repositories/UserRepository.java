package com.studies.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studies.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
