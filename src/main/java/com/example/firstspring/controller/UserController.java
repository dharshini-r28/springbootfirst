//package com.example.firstspring.controller;
//
//public class UserController {
//}
package com.example.firstspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.firstspring.entity.User;
import com.example.firstspring.Service.UserServiceImpli;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpli userServiceImpl;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User user) {
        return userServiceImpl.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        return userServiceImpl.deleteUser(id);
    }

    @GetMapping("/details")
    public List<User> getUser() {
        return userServiceImpl.getUser();
    }
}