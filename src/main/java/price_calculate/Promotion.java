package price_calculate;

import java.math.BigDecimal;

public class Promotion {
    Long id;
    String name;
    Integer type;
    Boolean used;//是否命中

    BigDecimal discount;//折扣
    BigDecimal specialOffer;//特价
    BigDecimal reduceAmount; //减免金额
}
