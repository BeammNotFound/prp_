package com.service.impl;

import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.vo.CreateUserVo;
import com.pojo.vo.ForgetPasswordVo;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper mapper;

    @Override
    public List<User> queryUserList() {
        return mapper.queryUserList();
    }

    @Override
    public void createUser(CreateUserVo user) {
        mapper.createUser(user);
    }

    @Override
    public void forgetPassword(ForgetPasswordVo user) {
        mapper.forgetPassword(user);
    }

    @Override
    public void updateUserByUserName(User user) {
        mapper.updateUserByUserName(user);
    }

    @Override
    public boolean verifyPassword(User user) {
        List<User> list = mapper.queryUserList();

        //密码效验
        for (User u: list) {
            if (DigestUtils.md5DigestAsHex(u.getUser_password().getBytes()).equals(DigestUtils.md5DigestAsHex(user.getEnter_password().getBytes()))) {
                return true;
            }
        }
        return false;

    }
}
