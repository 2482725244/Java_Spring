package com.xing.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xing.dao.UserDao;
import com.xing.model.User;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

     boolean addUser(User user);
     User getUserById(Long id);
     List<User> getAllUser();
     boolean deleteUserById(Long id);
     boolean updateUser(User user);
     User selectOne(String username,String password);
     IPage<User> selectPage(int current,int size);



}
