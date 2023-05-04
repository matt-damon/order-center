package order_query;

import lombok.Data;

import java.math.BigDecimal;

public class Promotion {
    Long id;
    String name;
    Integer type;
    /**
     * 单品促销，包含直降，折扣，特价
     */
    BigDecimal reduceAmount; //直降金额，促销价=原单价-直降金额
    BigDecimal discount;//折扣，促销价=原单价*折扣
    BigDecimal specialOffer;//特价

    BigDecimal offerAmount;//优惠减免的金额


}
