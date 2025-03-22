//package com.example.firstspring.controller;
//
//public class UserController {
//}
package com.example.firstspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.firstspring.entity.User;
import java.util.List;
import com.example.firstspring.Service.UserServiceImpli;

import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserController {

    @Autowired
    UserServiceImpli userServiceImpl;

    @PostMapping(value = "/user/create")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @PutMapping(value = "/user/update")
    public String updateUser() {
        return userServiceImpl.updateUser(null);
    }

    @DeleteMapping(value = "/user/delete")
    public String deleteUser() {
        return userServiceImpl.deleteUser(12);
    }

    @GetMapping(value = "/user/details")
    public List<User> getUser() {

        return userServiceImpl.getUser();
    }
}