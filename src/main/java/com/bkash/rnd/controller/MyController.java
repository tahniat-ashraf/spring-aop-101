package com.bkash.rnd.controller;

import com.bkash.rnd.aspect.MyService;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/beforeTest")
    public void testBefore(){
        myService.helloWorld();
    }
}
