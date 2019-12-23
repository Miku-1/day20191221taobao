package bean;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:37
 * @Description: 收货地址
 */
@Data
public class ReceivingAddress {

    private Integer id;
    /**
     * 地址
     */
    private String address;
    /**
     * 邮编
     */
    private String ZipCode;
    /**
     * 收货人
     */
    private String receivingPeople;
    /**
     * 收货人手机号
     */
    private String phoneNumber;

    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
