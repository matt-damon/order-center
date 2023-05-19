package price_calculate;

import java.math.BigDecimal;
import java.util.List;

/**
 * 价格计算入参
 */
public class PriceCalRequest {
    String userId;
    //运费计算和地址相关
    /** 国家编码 */
    String countryCode ;
    /** 一级地址编码 */
    String level1AddrCode ;
    /** 二级地址编码 */
    String level2AddrCode ;
    /** 三级地址编码 */
    String level3AddrCode ;
    /** 四级地址编码 */
    String level4AddrCode ;
    /** 详细地址 */
    String detailAddress ;

    List<PriceCalReqItem> calReqItems;
    List<Coupon> coupons;//指定使用的优惠券（平台级）
    Integer integration;//指定使用的积分
    BigDecimal eCardAmount;//指定使用电子卡余额
}
