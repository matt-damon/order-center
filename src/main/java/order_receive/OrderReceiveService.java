package order_receive;

import common.APIResult;

import java.util.List;

public interface OrderReceiveService {

    /**
     *
     * @param orders
     * @return
     */
    APIResult receiveOrder(List<Order> orders);

}
