package price_calculate;

import java.math.BigDecimal;
import java.util.List;

/**
 * 价格计算出参
 */
public class PriceCalResponse {
    List<PriceCalResItem> resItems;//店铺+商品列表

    //多个PriceCalResItem的合计
    BigDecimal originalAmount;//商品原价
    BigDecimal promotionAmount;//促销优惠（减免）金额
    BigDecimal soldAmount;//成交金额(活动价)=商品原价-促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal eCardAmount;//电子卡余额抵扣金额
    BigDecimal freightAmount;//运费金额
    BigDecimal paidAmount;//实付金额=成交金额+运费金额-优惠券抵扣金额-积分抵扣金额-电子卡余额抵扣金额

    List<Coupon> coupons;//使用的优惠券(平台级）
}
