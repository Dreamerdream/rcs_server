package com.juphoon.rcsrunner.mapper;



import com.juphoon.rcsrunner.entity.User;
import org.apache.ibatis.annotations.Param;


public interface UserMapper {

    User findById(@Param("id") int id);

}
