package com.example.libraryapplication_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @PostMapping("/")
    public String AdministrationLogin(){
        return "Welcome to administration login page";
    }

    @PostMapping("/signup")
    public String UserSignup(){
        return "Welcome to user registration page";
    }

    @PostMapping("/login")
    public String UserLogin(){
        return "Welcome to user login page";
    }
    @PostMapping("/entry")
    public String BooksEntry(){
        return "Welcome to books entry page";
    }
    @GetMapping("/view")
    public String ViewAllBooks(){
        return "Welcome to view all books page";
    }
    @PostMapping("/search")
    public String BooksSearch(){
        return "Welcome to books search page";
    }
}

