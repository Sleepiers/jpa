package com.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @user zzw
 * @date 2018/11/2
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;

    public String name;

    public String sex;

    public Integer age;

    @Column(name="update_time")
    public Date updateTime;

    //加Transient注解代表这个字段只在Java中出现，不在数据库层面提现
    @Transient
    public String beizu;
}
