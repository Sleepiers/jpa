package com.jpa.config;

import com.jpa.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @user zzw
 * @date 2018/11/5
 * @Configuration    指明当前类为配置类
 *
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyConfig {

    //将方法的返回值添加到容器中，容器中整个组件的id默认就是方法名
    @Bean
    public PersonService personService(){
        return new PersonService();
    }
}
