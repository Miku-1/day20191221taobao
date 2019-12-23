package dao;

/*
 *@Date: 23:10 2019/12/22
 *@Description:
 */

import bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private String Driver = "com.mysql.jdbc.Driver";
    private String UserName = "root";
    private String PassWord = "123456";
    private String Url = "jdbc:mysql://101.132.33.149:3306/wenxin";

    public UserDao() throws ClassNotFoundException {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Url, UserName, PassWord);
    }

    public void add(User user) {

    }

    public void delete(User user) {
    }

    public void update(User user) {
    }

    /*
     * 模糊查询
     * */
    public List searchByName(String name) {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM t_user WHERE t_user.username like '" + name + "'";
        /*
         * 需在maven中 指定jdk版本,即在pom.xml中修改
         * */
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setNickName(rs.getString(2));
                // ...
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;

    }

    public User getByName(String name) {
        User user = null;
        String sql = "SELECT * FROM t_user WHERE t_user.username = '" + name + "'";
        /*
         * 需在maven中 指定jdk版本,即在pom.xml中修改
         * */
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            ResultSet rs = s.executeQuery(sql);
           if(rs.next()){
               user = new User();
               user.setId(rs.getInt(1));
               user.setNickName(rs.getString(2));
               // ...

           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public Boolean login(String userName,String passWord){

        String sql = "SELECT * FROM t_user WHERE t_user.username = ? AND t_user.password = ? ";
        /*
         * 需在maven中 指定jdk版本,即在pom.xml中修改
         * */
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1,userName);
            ps.setString(2,passWord);
            ps.execute();
            ResultSet rs = ps.executeQuery(sql);
            if(rs.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }


    }
}