package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
@RequestMapping("index")
public class IndexController {

    @RequestMapping("hello")
    @ResponseBody
    public String hello(String name){
        // 获取IP地址
        try {
            String ip = InetAddress.getLocalHost().getHostAddress();
            String msg = String.format("Hello!you are %s,the ip is %s !",name,ip);
            return msg;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }
}
