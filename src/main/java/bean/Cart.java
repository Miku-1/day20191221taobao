package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:26
 * @Description: 购物车
 */
public class Cart {
    private Integer id;
    /**
     * 商品id
     */
    private Integer goodsId;
    /**
     * 谁的购物车
     */
    private Integer userId;
    /**
     * 买了几个
     */
    private Integer goodsNumber;
    /**
     * 总价
     */
    private Double price;

    private Date createTime;

    private Date updateTime;

}
