package com.galaxy.mm.service;

import com.galaxy.mm.bean.UserInfo;

import java.util.List;

public interface IUserinfoService {
    List<UserInfo> getUserInfoListAll();

    void addUser(UserInfo userInfo);

    void updateUser(UserInfo userInfo);

    void updateUserByName(String name,UserInfo userInfo);

    void delUser(UserInfo userInfo);


}
