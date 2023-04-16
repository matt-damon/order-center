package cart_v2;

import java.math.BigDecimal;
import java.util.List;

/**
 * 购物车
 */
public class Cart {
    String userId;//用户id
    String memberId;//会员id

    Integer totalLimitQuantity = 100;//购物车限制商品最大数量
    Integer totalQuantity;//购物车商品总数

    List<StoreItem> storeItems;//店铺列表

    //购物车级别的促销，整车促销
    Promotion cartPromotion;

    BigDecimal originTotalAmount;//商品优惠前总额
    BigDecimal promotionOfferAmount;//促销优惠金额
    BigDecimal couponOfferAmount; //优惠券抵扣总金额
    BigDecimal totalOfferAmount;  //优惠总金额
    BigDecimal totalAmount; //购物车结算总金额（优惠后）

    public static void main(String[] args) {
        Cart cart = new Cart();
        //店铺1
        StoreItem storeItem1 = new StoreItem();

    }

}
