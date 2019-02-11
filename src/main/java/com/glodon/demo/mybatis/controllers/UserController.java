package com.glodon.demo.mybatis.controllers;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.glodon.demo.mybatis.models.*;
import com.glodon.demo.mybatis.mappers.*;
import com.glodon.demo.mybatis.dtos.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(method = RequestMethod.POST)
    @Transactional
    public User createUser(UserProps props) {
        User user = new User();
        user.setName(props.getName());
        userMapper.insert(user);
        return user;
    }
/*
    @RequestMapping(method = RequestMethod.GET)
    public List<User> queryUsers(
            @RequestParam(required = false) String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        RowBounds rowBounds = new RowBounds(page * size, size);
        return userMapper.selectByName(name, rowBounds);
    }
   */


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @Transactional
    public void deleteUser(@PathVariable long id) {
        userMapper.deleteByPrimaryKey(id);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User queryUserByIds(@PathVariable long id) {

        return userMapper.selectByPrimaryKey(id);
    }


}
