package com.bkash.rnd;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = "com.bkash.rnd.aspect")
public class AspectConfiguration {
}
