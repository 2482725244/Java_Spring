package com.example.helloword.controller;


import com.example.helloword.Bean.Cat;
import com.example.helloword.Bean.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//ResponseBody
@Controller
public  class MyController {

    @Autowired
    Dog dog;
    @Autowired
    Cat cat;

    private List<Cat> list;
    private String[] names = {"<h1>jiafa</h1>","<h2>oudi</h2>","<h3>qiaoen</h3>"};


    @RequestMapping("/spring")
    public String requestHelloWorld(Model model){


        model.addAttribute("msg","<h1>Spring_boot春天的启动器</h1>");
        model.addAttribute("an",cat);
        model.addAttribute("shuzu",names);

        return "index";
    }
}
