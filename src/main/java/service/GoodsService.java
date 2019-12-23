package service;

/*
 *@Date: 23:01 2019/12/22
 *@Description:
 */

import bean.Goods;

public interface GoodsService {
    /*
    * 商家要上架新的产品
    * */
    Integer addGoods(Goods goods);

    Integer updateGoods(Goods goods);

    Integer deleteGoods();
}
