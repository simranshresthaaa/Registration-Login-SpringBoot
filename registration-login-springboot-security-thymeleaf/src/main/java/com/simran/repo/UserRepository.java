package com.simran.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simran.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
