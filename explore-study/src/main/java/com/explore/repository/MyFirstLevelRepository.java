package com.explore.repository;

import com.explore.annotation.FirstLevelRepository;
import com.explore.annotation.SecondLevelRepository;
import org.springframework.stereotype.Component;

/**
 * 我的 {@link FirstLevelRepository}
 *
 * @author Xiaohb
 * @since 2020/05/24
 */
//@FirstLevelRepository(value = "myFirstLevelRepository") //Bean 名称
@SecondLevelRepository(value = "myFirstLevelRepository") //Bean 名称
//@Component(value = "myFirstLevelRepository")
public class MyFirstLevelRepository {
}
