package order_change;

import common.APIResult;
import order_change.change_rule.ChangeRule;
import order_change.order_state_machine.Order;
import order_change.order_state_machine.OrderEventsEnum;

public interface OrderChangeService {

    /** 发送订单事件，触发状态机变更
     * @return
     */
    APIResult sendOrderEvent(String channelId, Long orderId,  OrderEventsEnum event);

    APIResult updateOrderInfo(Order order);

    APIResult saveOrUpdateChangeRule(ChangeRule rule);

    APIResult queryChangeRule(Integer orderType);

}
