package ua.com.coolshop.service;

import ua.com.coolshop.entity.User;

import java.util.List;

public interface UserService {


    void save(User user);
    List<User> findAll();
    User findOne(int id);
    void delete (int id);
}
