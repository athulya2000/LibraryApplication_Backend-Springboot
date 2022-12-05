package com.example.libraryapplication_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/")
    public String AdministrationLogin(){
        return "Welcome to administration login page";
    }
}

