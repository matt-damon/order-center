package order_generate;

import common.APIResult;

import java.util.List;
import java.util.Map;

public interface OrderGenerateService {

    /**
     *  创建订单
     * @param request
     * @return
     */
    APIResult orderCreate(OrderCreateRequest request);


    /**
     * 取消订单 1.用户主动取消； 2.未付款超时自动取消
     * @param operator  操作人
     * @param orderId 订单号
     * @return
     */
    APIResult orderCancel(String operator, Long orderId);


    /**
     * 订单接收
     * @param order
     * @return
     */
    APIResult orderReceive(Order order);


    /**
     * 生成订单号
     * @param params
     * @return
     */
    APIResult getOrderId(Map<String, Object> params);

}
