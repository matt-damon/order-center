package order_generate;

import price_calculate.Coupon;

import java.math.BigDecimal;
import java.util.List;

public class OrderCreateRequest {
    String userid;//用户id

    String countryCode ;/** 国家编码 */
    String level1AddrCode ;    /** 一级地址编码 */
    String level2AddrCode ;    /** 二级地址编码 */
    String level3AddrCode ;    /** 三级地址编码 */
    String level4AddrCode ;    /** 四级地址编码 */
    String detailAddress ;    /** 详细地址 */

    String preSplitId;//预拆分id，用于提单时校验
    List<PreOrder> preOrders;//预拆分好的订单

    Integer integration;//待抵扣积分
    BigDecimal eCardAmount;//待抵扣的电子卡余额
    List<Coupon> coupons;//待使用的优惠券(平台级）
}
