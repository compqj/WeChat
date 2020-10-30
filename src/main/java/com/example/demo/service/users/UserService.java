package com.example.demo.service.users;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface UserService {

    User User(Integer stuid);

    User user( Integer stuid);

    int updateByPrimaryKeySelective(Integer stuid, String name, String password, String phonenumber,
                                    String specialty, String grade, String dormitory, String role,String wdwx);

    User selectByPrimaryKey(Integer stuid);

    User selectByWdwx(String wdwx);

    int insertSelective(User user);

}
