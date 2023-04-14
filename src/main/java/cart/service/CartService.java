package cart.service;

import cart.Cart;

public interface CartService {

    /**
     * 获取购物车清单
     * @param 用户id,地址
     * @return
     */
    Cart getCart();


    boolean addItem();

    boolean deleteItem();

    boolean checkItem();

    boolean updateItem();

}
