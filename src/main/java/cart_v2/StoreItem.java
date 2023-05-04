package cart_v2;

import lombok.Data;
import java.util.List;

@Data
public class StoreItem {
    Long id;//店铺id，跨店铺时为促销id
    String name;//店铺名，跨店铺时为促销名
    Boolean isCrossStore;//是否跨店铺

    Long lastUpdateTs;//店铺操作时间，用于前端排序

    Boolean isChecked;//是否选中
    List<Product> products;//单品（促销）列表
    List<PromotionSet> promotionSets;//多品促销列表
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
