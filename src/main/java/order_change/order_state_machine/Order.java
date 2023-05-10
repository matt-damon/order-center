package order_change.order_state_machine;

import order_generate.Coupon;
import order_generate.Product;
import order_generate.Promotion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class Order {
    /** 订单编号 */
    Long id;
    /** 订单类型 */
    Integer orderType;

    /** 源订单id */
    Long srcOrderId;
    /** 渠道编码 */
    String channelId ;
    String channelName;//渠道名称
    String operator;//下单操作者，线下使用
    /** 用户id */
    String userId ;
    /** 用户昵称 */
    String userNickName ;
    String phone;//下单手机号
    /** 买家留言 */
    String userNote ;

    /** 店铺id */
    String storeId;
    String storeName;
    Integer storeType;//店铺类型

    /**商品信息 */
    List<Product> products;
    /** 使用的促销信息 */
    List<Promotion> promotions;
    /** 使用优惠券信息 */
    List<Coupon> coupons ;

    Integer quantity;//商品总数
    BigDecimal originalAmount ;/** 商品总金额（SUM(商品原价*数量) */
    BigDecimal promotionAmount;/** 促销优惠金额 */
    BigDecimal couponAmount ;/** 优惠券优惠金额 */
    Integer integration;//抵扣积分
    BigDecimal integrationAmount;//积分抵扣金额
    BigDecimal eCardAmount;//电子卡余额抵扣金额
    BigDecimal freightAmount ;/** 运费金额 */
    BigDecimal paidAmount ;/** 实付金额 */

    /** 支付方式 */
    Integer payType ;
    /** 支付账号 */
    String payAccount ;
    /** 商户号 */
    String merchantId ;
    /** 支付流水号 */
    String payFlowNo ;

    Integer invoiceType ;/** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
    Integer invoiceTitleType;//抬头类型
    String invoiceTitle;/** 开票抬头 */
    String taxNo;//税号
    String invoiceContent;  /** 开票内容（明细或者品类） */
    String invoiceReceiver;    /** 收票人姓名 */
    String invoiceReceiverPhone;   /** 收票人手机 */
    String invoiceReceiverEmail;/** 收票人邮箱 */
    String invoiceReceiverAddress;/** 收票人地址 */

    /** 收货人姓名 */
    String receiverName ;
    /** 收货人电话 */
    String receiverPhone ;
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

    /** 订单状态 */
    Integer status;
    /** 删除状态：0->未删除；1->已删除 */
    Integer delete ;

    /** 下单时间 */
    Date createTime;
    /** 支付时间 */
    Date payTime ;
    /** 发货时间 */
    Date shippingTime ;
    /** 评价时间 */
    Date commentTime ;
    /** 修改时间 */
    Date modifyTime ;

    /** 配送方式 */
    Integer deliveryType ;
    /** 配送单号 */
    String deliverySn ;
    /** 配送公司 */
    String deliveryCompany ;
    /** 预约配送时间 */
    Date deliveryReserveTime ;
    /** 发货时效 */
    Date shippingTimeLimit ;
    /** 配送时效*/
    Date deliveryTimeLimit ;
}
