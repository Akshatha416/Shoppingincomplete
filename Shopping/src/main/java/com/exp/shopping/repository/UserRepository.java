package com.exp.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.shopping.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
