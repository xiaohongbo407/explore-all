package com.explore.bootstrap;

import com.explore.annotation.EnableHelloWorld;
import com.explore.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 注解驱动方式
 *
 * @Author XiaoHB
 * @date 2020/5/24
 **/
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String  helloWorld =
                context.getBean("helloWorld", String.class);

        System.out.printf("helloWorld Bean : " + helloWorld);

        // 关闭上下文
        context.close();
    }
}
