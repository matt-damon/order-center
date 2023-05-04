package price_calculate;

import java.math.BigDecimal;

public class Coupon {
    Long id;//优惠券id
    String name;//优惠券名
    Integer type;//优惠券类型
    boolean used;//是否选中
    boolean isOverlay;//是否可叠加
    Integer range;//使用范围，0—全场，1—商家，2—类别，3—商品

    BigDecimal thresholdAmount;//使用门槛
    BigDecimal offerAmount;//优惠金额

    BigDecimal splitOfferAmount;//优惠分摊金额
}
