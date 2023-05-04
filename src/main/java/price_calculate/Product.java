package price_calculate;

import java.math.BigDecimal;
import java.util.List;


public class Product {
    Long id;//商品id
    Long storeId;//店铺id
    Integer quantity;//商品数量

    //出参
    boolean isVirtual;//是否虚拟商品
    boolean isGift;//是否赠品
    boolean isRaiseProduct;//是否加购商品

    BigDecimal originalPrice;//商品原单价
    BigDecimal raiseAmount;//加购金额，用于加价购
    BigDecimal promotionAmount;//促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
//    BigDecimal freightAmount;//运费分摊金额
    BigDecimal taxRate;//税费
    BigDecimal tax;//税费

    BigDecimal totalAmount;//实付金额
    List<Promotion> promotions; //指定或命中的促销列表
    List<Coupon> coupons;//优惠券分摊情况

}
