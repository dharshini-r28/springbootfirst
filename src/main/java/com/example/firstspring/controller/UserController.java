//package com.example.firstspring.controller;
//
//public class UserController {
//}
package com.example.firstspring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.firstspring.entity.User;
import java.util.List;
import com.example.firstspring.Service.UserServiceImpli;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
//@CrossOrigin(value = "http://localhost:3000/")
public class UserController {

    @Autowired
    UserServiceImpli userServiceImpl;


    @PostMapping(value = "/user/create")
    public User createUser(@RequestBody User user) {
        return userServiceImpl.createUser(user);
    }

    @PutMapping(value = "/user/update")
    public String updateUser()
    {
        return userServiceImpl.updateUser(null);
    }

    @DeleteMapping(value = "/user/delete")
    public String deleteUser()
    {
        return userServiceImpl.deleteUser(12);
    }

    @GetMapping(value = "/user/details")
    public List<User> getUser()
    {

        return userServiceImpl.getUser();
    }

    @GetMapping(value = "/user/findbyName/{name}")
    public User findByName(@PathVariable(value = "name") String name)
    {
        return userServiceImpl.findByName(name);
    }
    @GetMapping(value = "/user/findbyNameAndEmail")
    public User findByName(@RequestParam(value = "name") String name,@RequestParam(value = "email")String email)
    {
        return userServiceImpl.findByNameAndEmail(name,email);
    }
}