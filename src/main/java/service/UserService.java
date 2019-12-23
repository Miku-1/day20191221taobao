package service;

/*
 *@Date: 23:22 2019/12/22
 *@Description:
 */

import bean.User;
import java.util.List;

public interface UserService {

    /*
    * 新用户注册
    * nickName password sex phonenumber
    * */
    Boolean addUser(User user);

    /*
    * 用户信息的修改
    * */
    Boolean updateUser(User user);

    /*
    * 搜索用户
    * */
    List<User> searchUser(String name);

    /*
    * 登录
    * */
    Boolean login(String username,String password);

    /*
    * 用户注销
    * */
    Boolean deleteUser(User user);

    /*
    * 查找用户
    * */
    User getUser(String name);

}
