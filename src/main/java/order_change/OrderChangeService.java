package order_change;

import common.APIResult;

public interface OrderChangeService {

    /** 发送订单事件，触发状态机变更
     * @return
     */
    APIResult sendOrderEvent(String channelId, Long orderId,  OrderEventsEnum event);

    APIResult updateOrderInfo(Order order);

    APIResult saveOrUpdateChangeRule(ChangeRule rule);

    APIResult queryChangeRule(Integer orderType);

    APIResult saveOrderOperateRecord(OrderOperateRecord record);

    APIResult queryOrderOperateRecord(Long orderId);

}
