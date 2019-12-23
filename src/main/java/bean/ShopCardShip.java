package bean;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 22:09
 * @Description: 商家和卡卷的关系
 */
@Data
public class ShopCardShip {
    private Integer id;
    private Integer cardId;
    private Integer shopId;
    /**
     * 这个卡卷还有多少张
     */
    private Integer existNumber;
    private Date createTime;
    private Date updateTime;
}
