package com.xing.controller;

import com.xing.constant.Code;
import com.xing.exception.BusinessException;
import com.xing.model.User;
import com.xing.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        User user = userService.getUserById(id);
        return user;
    }
    @GetMapping
    public List<User> getAllUser(){
        List<User> users = userService.getAllUser();
        return users;
    }

//    @PostMapping
//    public String addUser(@RequestParam("name") String username, String password){
//        User user = new User();
//        user.setPassword(password);
//        user.setUsername(username);
//        boolean b = userService.addUser(user);
//        return b?"添加成功":"添加失败";
//    }

    @PostMapping
    public String addUser(@RequestBody User user){
        boolean b = userService.addUser(user);
        return b?"添加成功":"添加失败";
    }

    @PutMapping
    public String updateUser(@RequestBody User user){
        boolean b = userService.updateUser(user);
        return b?"修改成功":"修改失败";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        boolean b = userService.deleteUserById(id);
        return b?"删除成功":"删除失败";
    }

}
