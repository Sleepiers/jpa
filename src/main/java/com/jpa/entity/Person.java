package com.jpa.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @user zzw
 * @date 2018/11/5
 * @ConfigurationProperties这个注解的含义是将配置文件中的数据信息与注解中的实体类进行绑定
 * @Validated  JSR303数据校验
 */
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

    //@Value("${person.lastName}")
    //@Email
    private String lastName;
    private Integer age;
    private Boolean isSingle;

    private Map<String, Object> maps;
    private User user;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
