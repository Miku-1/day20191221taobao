package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:29
 * @Description: 商家类
 */
public class Shop {

    private Integer id;
    /**
     * 用户的id
     */
    private Integer userId;
    /**
     * 店铺名称
     */
    private String shopName;
    /**
     * 头像
     */
    private String imgUrl;
    /**
     * 店家地址
     */
    private String shopAddress;

    /**
     * 店铺等级
     */
    private Short level;
    /**
     * 店铺年龄
     */
    private Integer age;

    /**
     * 好评率
     */
    private Double  favorableate;
    /**
     * 添加时间
     */
    private Date creatTime;

    private Date updateTime;


}
