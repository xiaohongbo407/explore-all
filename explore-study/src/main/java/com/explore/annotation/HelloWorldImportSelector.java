package com.explore.annotation;

import com.explore.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld {@link ImportSelector } 实现
 * 基于接口驱动实现 @ImportSelector
 *
 * @Author XiaoHB
 * @date 2020/5/24
 **/
public class HelloWorldImportSelector  implements ImportSelector {
    /**
     * 自定义实现多中国返回值
     * @param annotationMetadata
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }

}
