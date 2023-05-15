package order_reversal;

import common.APIResult;

public interface AfterSaleService {

    /**
     * 生成
     * @param order
     * @return
     */
    APIResult createAfterSaleOrder(AfterSaleOrder order);

    APIResult saveAfterSaleOperateRecord(AfterSaleOperateRecord record);

    APIResult queryAfterSaleOperateRecord(Long afterSaleOrderId);

}
