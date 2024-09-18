package com.example.demo;

import org.example.mystarter.my.MyStarterTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestController
public class TestController {
    @Autowired
    MyStarterTemplate myStarterTemplate;

    @RequestMapping("/wellcome1")
    public void hello() {
        short s = 1;
        s= (short) (s+1);
        s+=1;
        Lock lock = new ReentrantLock(true);
        myStarterTemplate.printName();
    }
}
