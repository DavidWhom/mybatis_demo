package com.mybatis.demo.bean;

import lombok.Data;

/**
 * @author Jovan
 * @create 2019-06-28 22:18
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
