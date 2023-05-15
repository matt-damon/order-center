package cart;

import java.math.BigDecimal;
import java.util.List;

/**
 * 调用促销的出参，按促销id组织
 */
public class PromotionCart {

    List<Product> products;//无促销的商品列表
    List<PromotionInfo> promotions;//条件促销列表
    List<Coupon> coupons;//使用的优惠券
    Promotion cartPromotion;//购物车级别的促销，整车促销

    BigDecimal originTotalAmount;//商品优惠前总额
    BigDecimal promotionOfferAmount;//促销优惠金额
    BigDecimal couponOfferAmount; //优惠券抵扣总金额
    BigDecimal totalOfferAmount;  //优惠总金额
    BigDecimal totalAmount; //购物车结算总金额（优惠后）

}
