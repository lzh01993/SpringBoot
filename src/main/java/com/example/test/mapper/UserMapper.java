package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //多变量需要加注解
    UserBean getInfo(@Param("name")String name, @Param("password")String password);

}
