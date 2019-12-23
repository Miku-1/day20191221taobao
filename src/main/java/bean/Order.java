package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:28
 * @Description: 订单类
 *         订单编号 商品信息 数量 用户信息 支付状态 优惠卷id
 */
public class Order {
    /*
     * 订单编号
     * */
    private Integer id;

    /*
    * 用户id
    * */
    private Integer userId;

    /*
    * 商品id
    * */
    private Integer goodsId;


    /*
    * 购买数量
    * */
    private Integer buyNum;

    /*
    * 支付状态
    * */
    private Short isPay;

    /*
    * 优惠卷id
    * */
    private Integer cardId;

    /*
     * 创建时间
     * */
    private Date createTime;
    /*
     *修改时间
     * */
    private Date updateTime;


}
