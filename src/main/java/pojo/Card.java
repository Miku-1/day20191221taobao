package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:27
 * @Description: 卡卷
 *
 */
@Data
public class Card {
    private Integer id;
    private String cardName;
    private String introduce;
    /**
     * 过期时间
     */
    private Date expiredTime;
    /**
     * 使用范围
     */
    private Short useRange;
    /**
     * 能减多少钱
     */
    private Double price;
    private Date createTime;
    private Date updateTime;

}
