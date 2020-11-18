package com.jiekeliu.pojo;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/18 0018 12:45
 * @Description:
 */
public class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
