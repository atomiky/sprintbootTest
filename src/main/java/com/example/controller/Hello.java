package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;

@RestController
public class Hello {
    @GetMapping("/hi")
    public String hi(){
        System.out.println("hello");
        return "hi";
    }
}
