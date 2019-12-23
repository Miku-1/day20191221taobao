package bean;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:34
 * @Description: 物流类
 */
public class Logistics {
    /*
     *物流id
     * */
    private Integer id;

    /*
     * 订单id
     * */
    private Integer orderId;

    /*
     * 负责人姓名
     * */
    private String chargeName;

    /*
     * 负责人联系方式
     * */
    private String chargeNumber;

    /*
     * 运输公司
     * */
    private String company;

    /*
     * 运输方式
     * */
    private String style;

    /*
     * 发货时间
     * */
    private Date delivery;

    /*
     * 运输路线
     * */
    private String route;


}
