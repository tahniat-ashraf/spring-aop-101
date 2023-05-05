package com.tahniat.rnd.controller;

import com.tahniat.rnd.aspect.annotation.Idempotent;
import com.tahniat.rnd.service.MyService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@RestController
public class MyController {

    private final MyService myService;

    public MyController(
            MyService myService
    ){
        this.myService = myService;
    }

    @GetMapping("/test")
    @Idempotent
    public void test(){
        myService.helloWorld();
    }
}
