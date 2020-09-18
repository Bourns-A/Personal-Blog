package com.bourns.blog.service;

import com.bourns.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
