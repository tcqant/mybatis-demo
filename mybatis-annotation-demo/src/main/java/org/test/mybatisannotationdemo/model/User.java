package org.test.mybatisannotationdemo.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String address;
}
