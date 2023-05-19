package price_calculate;

import cart.Product;

import java.math.BigDecimal;
import java.util.List;

public class Promotion {
    Long id;
    String name;
    Integer range;//促销级别，平台级别，单店铺，跨店铺
    Integer type;//促销类型，满返，满赠..
    String tag;//促销标签
    Boolean hit;//是否命中


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
