package com.zhongruan.controller;

import com.zhongruan.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Handler {

    @GetMapping("/index01")
    public String index() {
        System.out.println("执行了index方法");
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {
        System.out.println("执行了index方法");
        List<User> list = new ArrayList<>();
        list.add(new User(1, "张三", 18));
        model.addAttribute("list", list);
        return "index";

    }
}
