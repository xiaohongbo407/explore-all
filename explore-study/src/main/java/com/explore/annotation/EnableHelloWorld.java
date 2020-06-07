package com.explore.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 *  激活 HelloWorld 模块
 *  模块装配 注解驱动方式
 *
 * @author XiaoHB
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(HelloWorldConfiguration.class)
@Import(HelloWorldImportSelector.class)

public @interface EnableHelloWorld {

}
