package com.doukit.main.demo.entity;

import java.io.Serializable;

/**
 * Author: Aborn Jiang
 * Email : aborn.jiang AT foxmail.com
 * Date  : 4/8/15
 * Time  : 11:52 PM
 */
public class UserInfoDo implements Serializable {

    private static final long serialVersionUID = 2069195890284511289L;

    private Integer id;
    private String name;
    private String address;

    public UserInfoDo() {
    }

    public UserInfoDo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfoDo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
