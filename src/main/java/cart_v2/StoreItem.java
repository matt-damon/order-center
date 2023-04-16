package cart_v2;

import java.util.List;

public class StoreItem {
    Long id;//店铺id，跨店铺时为促销id
    String name;//店铺名，跨店铺时为促销名
    boolean isCrossStore;//是否跨店铺

    Long lastUpdateTs;//店铺操作时间，用于前端排序

    List<Product> products;//单品，可带单品促销
    List<PromotionItem> promotionItems;//多品促销
}

/**
 * 满减   PromotionItem
 *    A
 *       Suit
 *    B
 *
 *    C Sku
 *
 */
