package cart;

import java.math.BigDecimal;
import java.util.List;

/**
 * 调用促销的出参
 */
public class PromotionResult {

    List<Product> products;//所有商品平铺
    List<Promotion> promotions;//所有命中的促销，包含平台级促销
    List<Coupon> coupons;//使用的优惠券

    BigDecimal originAmount;//商品优惠前总额
    BigDecimal promotionAmount;//促销优惠金额
    BigDecimal couponAmount; //优惠券抵扣总金额
    BigDecimal offerAmount;  //优惠总金额
    BigDecimal totalAmount; //结算总金额（优惠后）

}
