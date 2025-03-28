package com.example.firstspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.firstspring.entity.User;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByName(String name);

    User findByNameAndEmail(String name,String email);
}