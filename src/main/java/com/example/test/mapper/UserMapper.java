package com.example.test.mapper;

import com.example.test.bean.UserBean;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    UserBean getInfo(@Param("name")String name, @Param("password")String password);

}
