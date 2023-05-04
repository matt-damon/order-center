package price_calculate;


import java.math.BigDecimal;
import java.util.List;

/**
 * 按店铺+商品（订单）维度计算商品价格
 */
public class PriceCalResItem {
    Long id;//店铺id，跨店铺时为促销id
    String name;//店铺名，跨店铺时为促销名

    List<Product> products;//商品列表

    BigDecimal originalPrice;//商品原价
    BigDecimal promotionAmount;//促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal freightAmount;//运费分摊金额
    BigDecimal taxRate;//税率
    BigDecimal tax;//税费
    BigDecimal totalAmount;//实付金额

    List<Promotion> promotions; //命中的促销列表
    List<Coupon> coupons;//使用的优惠券

}
