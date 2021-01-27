package com.example.suhiru.projectsunsolar.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/login")
    private String login(){

        return "authenticated successfully";

    }

}
