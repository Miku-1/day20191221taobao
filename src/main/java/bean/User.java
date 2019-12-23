package bean;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:28
 * @Description: 个人信息
 */
@Data
public class User {

    private Integer id;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 性别
     */
    private String sex;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private String imgUrl;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 是商家还是普通用户
     * 0 普通用户
     * 1 商家
     */
    private Short type;
    /**
     * 创建账户的时间
     */
    private Date createTime;

    /**
     * 修改密码的时间
     */
    private Date updateTime;
}
