package com.ckp.learning.springbatchexample.repository;

import com.ckp.learning.springbatchexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
