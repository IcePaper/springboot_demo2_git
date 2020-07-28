package com.zhongruan.repository;

import com.zhongruan.bean.User;

import java.util.Collection;

public interface UserRepository {
    Collection<User> findAll();

    User findById(int id);

    void saveOrUpdate(User user);

    void deleteById(int id);
}
