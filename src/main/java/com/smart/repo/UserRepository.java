package com.smart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.entites.User;

public interface UserRepository extends JpaRepository<User, Integer> {


}
