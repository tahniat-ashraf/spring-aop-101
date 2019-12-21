package com.bkash.rnd.aspect;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@Slf4j
@Service
public class MyService {

    public void  helloWorld(){
        log.info("Hello World");
    }

    public void helloNoakhali(){
        log.info("Hello Noakhali");
    }
}
