package com.example.mybatis;

/**
 * @author xiaojie
 * @version 1.0
 * @date 2023/2/8 11:17
 */
public interface IUserDao {

    String queryUserName(String uId);

    Integer queryUserAge(String uId);

}
