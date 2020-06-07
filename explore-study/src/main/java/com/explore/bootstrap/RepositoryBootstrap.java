package com.explore.bootstrap;

import com.explore.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Component 自定义模式注解
 *
 * @author XiaoHB
 * @date 2020/05/24
 */
@ComponentScan(basePackages = "com.explore.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("myFirstLevelRepository", MyFirstLevelRepository.class);

        System.out.printf("myFirstLevelRepository Bean : " + myFirstLevelRepository);

        // 关闭上下文
        context.close();
    }
}
