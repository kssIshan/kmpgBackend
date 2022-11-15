package com.example.docWareBackend.controller;


import com.example.docWareBackend.dto.UserDTO;
import com.example.docWareBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value= "api/v1/user")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

    @GetMapping("/getUser")
    public List<UserDTO> getUser(@RequestHeader("Authorization") String Authorization){
        System.out.println(Authorization+"////////////////");
        return userService.getAllUsers(Authorization);
    }
}
