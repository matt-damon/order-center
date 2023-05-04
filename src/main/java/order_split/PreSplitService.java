package order_split;

import cart_v2.Cart;
import cart_v2.StoreItem;

import java.util.List;

public interface PreSplitService {

//    /**
//     * 保存或更新拆分策略
//     * @param strategy
//     * @return
//     */
//    APIResult saveOrUpdateOrderSplitStrategy(OrderSplitStrategy strategy);
//
//    /**
//     * 查询拆分策略
//     * @param strategy
//     * @return
//     */
//    APIResult queryOrderSplitStrategy(OrderSplitStrategy strategy);
//
//    /**
//     * 保存或更新拆分策略规则
//     * @param strategyRule
//     * @return
//     */
//    APIResult saveOrUpdateOrderSplitStrategyRule(OrderSplitStrategyRule strategyRule);
//
//    /**
//     * 查询拆分策略规则
//     * @param strategyRule
//     * @return
//     */
//    APIResult queryOrderSplitStrategyRule(OrderSplitStrategyRule strategyRule);
//
//    /**
//     * 保存或更新拆分流程
//     * @param splitFlow
//     * @return
//     */
//    APIResult saveOrUpdateOrderSplitFlow(OrderSplitFlow splitFlow);
//
//    /**
//     * 查询拆分流程
//     * @param splitFlow
//     * @return
//     */
//    APIResult queryOrderSplitFlow(OrderSplitFlow splitFlow);

    /**
     * 预拆分，包含价格计算过程
     * @param
     * @return
     */
    List<PreSplitResItem> preSplit(List<StoreItem> );


}
