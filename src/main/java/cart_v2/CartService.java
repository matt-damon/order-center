package cart_v2;


public interface CartService {

    /**
     * 获取购物车清单
     * @param
     * @return
     */
    Cart getCart();

    boolean addItem();

    boolean deleteItem();

    boolean checkItem();

    boolean updateItem();

}
