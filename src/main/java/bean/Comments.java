package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:28
 * @Description: 评论类
 */
public class Comments {
    /*
     * id
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
     * 评论内容
     * */
    private String comment;

    /*
     * 星级满意度(1-5)
     * */
    private Integer satisfaction;

    /*
    * 是否公开
    * */
    private Short isPublic;

    /*
    * 附带图片
    * */
    private String imgUrl;

    /*
    * 短视频
    * */
    private String videoUrl;

    /*
    * 评价时间
    * */
    private Date createDate;

    /*
    * 修改时间
    * */
    private Date updateDate;



}
