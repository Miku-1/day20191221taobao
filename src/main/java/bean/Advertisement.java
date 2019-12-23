package bean;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:32
 * @Description: 广告类
 */
@Data
public class Advertisement {
    /*
     * 编号
     * */
    private Integer id;
    /*
     * 广告图片链接
     * */
    private String imgUrl;
    /*
     *
     * */
    private Short whichOneIsFirst;
    /*
     * 广告资源链接
     * */
    private String targetURl;

    /*
     * 描述
     * */
    private String shortIntroduce;

    /*
     * 创建时间
     * */
    private Date createTime;
    /*
     *修改时间
     * */
    private Date updateTime;
}
