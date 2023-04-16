package cart_v2;

import java.math.BigDecimal;
import java.util.List;

/**
 * 单品促销，立减/直降/折扣，买赠品，加价购等
 * 多品促销，套装，满赠，满减，跨店铺...
 */
public class Promotion {
    Long id;
    String name;
    Integer type;

    List<Product> subProducts;//子商品，例如赠品和加价购商品

    /**
     * 单品促销，包含直降，折扣，特价
     */
    BigDecimal reduceAmount; //直降金额，促销价=原单价-直降金额
    BigDecimal discount;//折扣，促销价=原单价*折扣
    BigDecimal specialOffer;//特价

    BigDecimal offerAmount;//优惠减免的金额

}
