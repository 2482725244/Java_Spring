package com.xing.service.imp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xing.constant.Code;
import com.xing.dao.UserDao;
import com.xing.exception.BusinessException;
import com.xing.model.User;
import com.xing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        int count = userDao.insert(user);
        return count > 0 ?true:false;
    }

    @Override
    public User getUserById(Long id) {
        User user = userDao.selectById(id);
        return user;
    }

    @Override
    public List<User> getAllUser() {
        try {
            int a = 1/0;
        }catch (Exception e){
            throw new BusinessException(Code.Z_ERR,e.getMessage());
        }
        List<User> users = userDao.selectList(null);
        return users;
    }

    @Override
    public boolean deleteUserById(Long id) {
        int count = userDao.deleteById(id);
        return count > 0 ?true:false;
    }

    @Override
    public boolean updateUser(User user) {
        int count = userDao.updateById(user);
        return count > 0 ?true:false;
    }

    @Override
    public User selectOne(String username, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<User>();
        wrapper.eq("username",username);
        wrapper.eq("password",password);

        User user = userDao.selectOne(wrapper);
        return user;
    }

    @Override
    public IPage<User> selectPage(int current, int size) {
        Page<User> page = new Page<User>(current,size);
        return userDao.selectPage(page,null);
    }
}
