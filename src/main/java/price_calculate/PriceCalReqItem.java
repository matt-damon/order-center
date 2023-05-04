package price_calculate;

import java.math.BigDecimal;
import java.util.List;

/**
 * 按店铺+商品的维度
 */
public class PriceCalReqItem {
    List<Product> products;//商品列表
    BigDecimal freightAmount;//运费金额
    List<Coupon> coupons;//指定使用的优惠券
}
