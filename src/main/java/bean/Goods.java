package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:26
 * @Description: 商品类
 */
public class Goods {
    /*
     * 商品id
     * */
    private Integer id;
    /*
    * 商品图片
    * */
    private String imgUrl;

    /*
     * 商品名字
     * */
    private String name;

    /*
     * 当前价格
     * */
    private Double price;

    /*
    * 商品描述
    * */
    private String description;

    /*
     * 库存量
     * */
    private String count;

    /*
     * 商品分类
     * */
    private String goodsStyle;

    /*
     * 生产时间
     * */
    private Date creatDate;

    /*
     * 上架时间
     * */
    private Date usedTime;

    /*
     * 修改时间
     * */
    private Date changeTime;
}
