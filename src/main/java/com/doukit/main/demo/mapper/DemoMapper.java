package com.doukit.main.demo.mapper;

import com.doukit.main.demo.entity.UserInfoDo;

import java.util.List;

/**
 * Like ibatis's DAO
 * @author Aborn Jiang
 * @date 3/15/15
 * @time 4:00 PM
 */
public interface DemoMapper {
    public void insert(UserInfoDo basicDo);
    public UserInfoDo getUserInfo(int id);
    List<UserInfoDo> listAllUsersInfo();
}
