package com.example.demo.dao;

import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
@Component
@Repository
public interface UserMapper {

    User User(Integer stuid);

    User user( Integer stuid);

    int deleteByPrimaryKey(Integer stuid);

    int insert(User user);

    int insertSelective(User user);

    User selectByPrimaryKey(Integer stuid);

    User selectByWdwx(String wdwx);

    int updateByPrimaryKeySelective(Integer stuid, String name, String password, String phonenumber,
                                    String specialty, String grade, String dormitory, String role,String wdwx);

    int updateByPrimaryKey(User user);
}
