package cart;

import java.math.BigDecimal;
import java.util.List;

//促销阶梯
public class PromotionStair {
    private Long id;//阶梯id
    private Long promotionId;//促销id
    private BigDecimal minimumCharge;//最低消费
    private BigDecimal discountAmount;//减免金额
    private List<SkuItem> giftList;//满赠赠品
}
