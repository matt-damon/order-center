package order_split;

import price_calculate.Coupon;
import price_calculate.Promotion;

import java.math.BigDecimal;
import java.util.List;


public class Product {
    Long id;//商品id
    Long storeId;//店铺id
    Integer quantity;//商品数量

    Boolean isGift;//是否赠品
    Boolean isAddBuy;//是否加购商品

    BigDecimal originalAmount;//商品原价
    BigDecimal addBuyAmount;//加购金额，用于加价购
    BigDecimal promotionAmount;//促销优惠（减免）金额
    BigDecimal soldAmount;//成交金额=商品原价-促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal eCardAmount;//电子卡余额抵扣金额
    BigDecimal paidAmount;//实付金额=成交金额-优惠券抵扣金额-积分抵扣金额-电子卡余额抵扣金额

    Promotion parentPromotion;//父级促销
    List<Promotion> promotions; //指定或命中的促销列表
    List<Coupon> coupons;//优惠券分摊情况

}
