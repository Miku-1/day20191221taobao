package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:31
 * @Description: 主推商品
 * 包含:图片 价格 描述
 */
public class MainPushGoods {

    /*
     * id
     * */
    private Integer id;

    /*
     * 商品id
     * */
    private Integer goodsId;

    /*
     * 描述
     * */
    private String introduce;

    /*
    * 创建时间
    * */
    private Date createTime;

    /*
    * 修改时间
    * */
    private Date updateTime;

    /*
    * 推送时间
    * */
    private Date pushTime;

    /*
    * 结束时间
    * */
    private Date endTime;



}
