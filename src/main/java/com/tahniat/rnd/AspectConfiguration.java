package com.tahniat.rnd;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Tahniat Ashraf Priyam
 * @since 12/21/19
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@ComponentScan(basePackages = "com.tahniat.rnd.aspect")
public class AspectConfiguration {

}
