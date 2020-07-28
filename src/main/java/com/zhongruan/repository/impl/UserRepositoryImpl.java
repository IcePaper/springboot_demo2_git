package com.zhongruan.repository.impl;

import com.zhongruan.bean.User;
import com.zhongruan.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepositoryImpl implements UserRepository {
    // 静态变量 随着类加载而加载
    private static Map<Integer, User> userMap;

    // 静态代码块
    static {
        userMap = new HashMap<>();
        userMap.put(1, new User(1, "张三", 18));
        userMap.put(2, new User(2, "李四", 20));
        userMap.put(3, new User(3, "王五", 22));
        userMap.put(4, new User(4, "赵六", 24));
    }

    @Override
    public Collection<User> findAll() {
        return userMap.values();
    }

    @Override
    public User findById(int id) {
        return userMap.get(id);
    }

    @Override
    public void saveOrUpdate(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void deleteById(int id) {
        userMap.remove(id);
    }
}
