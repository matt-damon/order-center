package price_calculate;

import java.math.BigDecimal;
import java.util.List;

/**
 * 价格计算入参
 */
public class PriceCalRequest {
    List<PriceCalReqItem> calReqItems;
    List<Coupon> coupons;//指定使用的优惠券（平台级）
    Integer integration;//指定使用的积分
    BigDecimal eCardAmount;//指定使用电子卡余额
}
