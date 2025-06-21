package com.xing.controller;

import com.xing.model.User;
import com.xing.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(String username, String password, HttpSession session){
        User user = userService.selectOne(username, password);
        if (user != null){
            session.setAttribute("user",user);
            return "redirect:/home";
        }
        return "redirect:/login";
    }

    @RequestMapping("/home")
    public String getHome(){
        return "home";
    }

}
