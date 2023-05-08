package order_generate;

import common.APIResult;

import java.util.List;

public interface OrderGenerateService {

    /**
     *
     * @param orders
     * @return
     */
    APIResult orderCreate(List<Order> orders);




}
