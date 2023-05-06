package order_split;

import java.math.BigDecimal;

public class Coupon {
    Long id;//优惠券id
    String name;//优惠券名
    Integer type;//优惠券类型
    Boolean used;//是否选中
    Boolean isOverlay;//是否可叠加
    Integer range;//使用范围，0—全场，1—商家，2—类别，3—商品

    BigDecimal threshold;//使用门槛
    BigDecimal offerAmount;//优惠金额
    BigDecimal shareOfferAmount;//优惠分摊金额
}
