package order_generate;

import java.math.BigDecimal;

public class Promotion {
    Long id;
    String name;
    Integer type;
    String content;//促销内容

    BigDecimal discount;//折扣
    BigDecimal specialOffer;//特价
    BigDecimal reduceAmount; //减免金额

    Boolean used;//是否命中
}
