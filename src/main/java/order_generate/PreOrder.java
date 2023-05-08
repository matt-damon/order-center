package order_generate;

import price_calculate.Coupon;
import price_calculate.Product;
import price_calculate.Promotion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 预订单
 */
public class PreOrder {
    Long storeId;//店铺id，跨店铺时为促销id
    List<Product> products;//商品列表
    List<Promotion> promotions; //促销列表
    List<Coupon> coupons;//使用的优惠券

    Integer deliveryType ;    /** 配送方式 */
    Date deliveryReserveTime ;   /** 预约配送时间 */
    Date shippingTimeLimit ;    /** 发货时效 */



    Integer invoiceType ;/** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
    Integer invoiceTitleType;//抬头类型
    String invoiceTitle;/** 开票抬头 */
    String taxNo;//税号
    String invoiceContent;  /** 开票内容（明细或者品类） */
    String invoiceReceiver;    /** 收票人姓名 */
    String invoiceReceiverPhone;   /** 收票人手机 */
    String invoiceReceiverEmail;/** 收票人邮箱 */
    String invoiceReceiverAddress;/** 收票人地址 */

    String buyerNote;//用户备注
}
