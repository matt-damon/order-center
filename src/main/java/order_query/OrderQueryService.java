package order_query;

import order_receive.Order;

import java.util.List;

public interface OrderQueryService {

    /**
     * 查询订单列表
     * @param order
     * @return
     */
    List<Order> queryOrderList(Order order);

    /**
     * 查询订单详情
     * @param orderId
     * @return
     */
    Order queryOrderDetail(Long orderId);

}
