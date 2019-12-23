package dao;

/*
 *@Date: 22:45 2019/12/22
 *@Description:
 */

import bean.Goods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GoodsDao {
    private String Driver = "com.mysql.jdbc.Driver";
    private String UserName = "root";
    private String PassWord = "123456";
    private String Url = "jdbc:mysql://101.132.33.149:3306/wenxin";
    public GoodsDao() throws ClassNotFoundException {
        try{
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(Url,UserName,PassWord);
    }

    public void add(Goods goods){

    }

    public void delete(Goods goods){

    }

    public void update(Goods goods){

    }

    public void getList(Goods goods){


    }
}
