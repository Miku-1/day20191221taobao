package bean;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:45
 * @Description: 用户的收货地址
 */
@Data
public class UserReceivingAddressShip {
    private Integer id;
    /**
     * 那个用户的收货地址
     */
    private Integer userId;
    /**
     * 收货地址的id
     */
    private Integer receivingAddressId;
    /**
     * 是否默认地址
     * 0 默认
     * 1 非默认
     */
    private Short defaultAddress;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
