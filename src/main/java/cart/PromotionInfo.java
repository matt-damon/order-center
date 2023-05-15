package cart;

import java.math.BigDecimal;
import java.util.List;

public class PromotionInfo {
    Long id;
    String name;
    Integer type;
    String tag;//促销标签
    BigDecimal balance;//差额，还差多少满足促销条件
    /**
     * 单品促销，包含直降，折扣，特价
     */
    BigDecimal reduceAmount; //直降金额，促销价=原单价-直降金额
    BigDecimal discount;//折扣，促销价=原单价*折扣
    BigDecimal specialOffer;//特价

    BigDecimal offerAmount;//优惠减免的金额
    List<Product> products;//命中该促销的商品

}
