package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 22:07
 * @Description: 卡卷和用户的关系
 */
@Data
public class UserCardShip {
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 卡片id
     */
    private Integer cardId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
