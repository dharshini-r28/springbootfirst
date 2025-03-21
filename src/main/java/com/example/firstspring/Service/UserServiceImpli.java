package com.example.firstspring.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.firstspring.entity.User;
import com.example.firstspring.repository.UserRepository;
@Service
public class UserServiceImpli {
    @Autowired
    private UserRepository userRepository;

    ArrayList<User> users=new ArrayList<>();

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public String updateUser(User user) {
        userRepository.save(user);
        return "User updated successfully";
    }

    public String deleteUser(int id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }

    public List<User> getUser() {
        return userRepository.findAll();}}