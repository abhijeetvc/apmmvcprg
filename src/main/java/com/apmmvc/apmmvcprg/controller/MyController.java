package com.apmmvc.apmmvcprg.controller;

import com.apmmvc.apmmvcprg.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

    @GetMapping("/register")
    public String getHome(Model model){
        model.addAttribute("user",new User());
        return "register";
    }

    @PostMapping("/saveData")
    public String saveUser(User user){

        return "success";
    }
}
