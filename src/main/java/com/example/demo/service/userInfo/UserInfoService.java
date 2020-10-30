package com.example.demo.service.userInfo;

import com.example.demo.model.UserInfo;

public interface UserInfoService {
    UserInfo selectByWxh(String wxh);
}
