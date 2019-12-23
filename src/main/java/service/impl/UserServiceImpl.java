package service.impl;

/*
 *@Date: 0:21 2019/12/23
 *@Description:
 */

import bean.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import dao.UserDao;
/*
* 用户注册
* *用户名,密码符合要求检测
* 用户名唯一性检测(异步,按用户名查询)
* 注册请求(邮箱验证码等)
* 返回注册结果
*
* 用户添加好友-模糊查询
*
* 查看还有信息
* */
public class UserServiceImpl implements UserService {
    UserDao userDao =null;
    public UserServiceImpl() throws ClassNotFoundException {
        userDao = new UserDao();
    }

    @Override
    public Boolean addUser(User user) {
        /*
        * 注册账号
        * */
        try{
            userDao.add(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Boolean updateUser(User user) {
        try{
            userDao.update(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<User> searchUser(String name) {
        List userList = userDao.searchByName(name);

        return userList;
    }

    public User getUser(String name){
        User user;
        user = userDao.getByName(name);
        return user;
    }


    @Override
    public Boolean deleteUser(User user) {
        return null;
    }


    /*
     * 传过来的账户密码以特定方式加密,生成一个字符串
     * 收到该字符串 以同样的方法解密拿到数据与数据库中信息比对
     * */
    @Override
    public Boolean login(String userName,String passWord) {
        return userDao.login(userName,passWord);
    }


}
