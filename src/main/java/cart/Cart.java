package cart;

import java.math.BigDecimal;
import java.util.List;

//原始购物车—>包含促销的购物车



public class Cart {

    String userId;//用户id
    String memberId;//会员id

    Integer totalLimitQuantity = 100;//购物车限制商品最大数量
    Integer totalQuantity;//购物车商品总数

    List<SkuItem> skuItemList; //单品列表，包含买赠促销，单品促销
    List<ManJianSuit> manJianSuits;//满减促销列表
    List<ManZengSuit> manZengSuits;//满赠促销列表


    BigDecimal originTotalAmount;//商品优惠前总额
    BigDecimal promotionOfferAmount;//促销优惠金额
    BigDecimal couponOfferAmount; //优惠券抵扣总金额
    BigDecimal totalOfferAmount;  //优惠总金额
    BigDecimal totalAmount; //购物车结算总金额（优惠后）

}
