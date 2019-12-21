package pojo;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:32
 * @Description: 轮播图类
 */
public class Swiper {
    private Integer id;
    /**
     * 图片
     */
    private String imgUrl;
    /**
     * 显示的顺序
     */
    private Integer showShort;

    /**
     * 设置不能显示
     * 0 标识可以显示
     * 1 标识不可以
     */
    private Short canShow;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}
