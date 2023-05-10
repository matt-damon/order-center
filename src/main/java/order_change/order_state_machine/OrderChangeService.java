package order_change.order_state_machine;

import common.APIResult;

public interface OrderChangeService {

    /**
     *  启动状态机-恢复状态机-触发状态机状态变更-持久化状态机
     * @param order
     * @param event
     * @return
     */
    APIResult sendEvent(Order order, OrderEvent event);
}
