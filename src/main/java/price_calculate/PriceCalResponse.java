package price_calculate;

import java.math.BigDecimal;
import java.util.List;

/**
 * 价格计算出参
 */
public class PriceCalResponse {

    List<PriceCalResItem> resItems;//店铺+商品列表

    //多个PriceCalResItem的合计
    BigDecimal originalPrice;//商品原价
    BigDecimal promotionAmount;//促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal freightAmount;//运费金额
    BigDecimal taxRate;//税率
    BigDecimal tax;//税费
    BigDecimal totalAmount;//实付金额

    List<Promotion> promotions; //命中的促销列表
    List<Coupon> coupons;//使用的优惠券

}
