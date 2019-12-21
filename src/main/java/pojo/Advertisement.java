package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:32
 * @Description: 广告类
 */
@Data
public class Advertisement {
    private Integer id;
    private String imgUrl;
    private Short whichOneIsFirst;
    private String targetURl;
    private String shortIntroduce;
    private Date createTime;
    private Date updateTime;
}
