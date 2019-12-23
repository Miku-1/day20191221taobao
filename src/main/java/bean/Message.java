package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:26
 * @Description: 沈泽鹏写点注释吧
 */
public class Message {
    /*
    * id
    * */
    private Integer id;

    /*
    * 发送用户id
    * */
    private Integer senderId;

    /*
    * 接收用户id
    * */
    private Integer receiverId;

    /*
    * 文本内容
    * */
    private String comment;

    /*
    *图片内容
    * */
    private String imgUrl;

    /*
     * 发送时间
     * */
    private Date createTime;

    /*
     *修改时间
     * */
    private Date updateTime;
}
