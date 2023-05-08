package order_generate;

import java.util.Date;
import java.util.List;


public class Order {
    
    /** 订单编号 */
    Long id;
    /** 订单类型 */
    Integer orderType ;
    /** 渠道编码 */
    String channelId ;
    String channelName;//渠道名称

    /** 店铺id */
    String storeId;
    /** 源系统id */
    Integer srcSystemId;
    /** 源系统名称 */
    String srcSystemName;
    /** 源订单类型 */
    Integer srcOrderType ;
    /** 源订单id */
    Long srcOrderId;


    /** 用户id */
    String userId ;
    /** 用户昵称 */
    String userNickName ;
    String phone;//下单手机号


    /** 下单时间 */
    Date createTime;
    /** 订单状态 */
    Integer status;

    /** 买家留言 */
    String buyerNote ;


    /** 订单总金额 */
    Double originalAmount ;
    /** 应付金额（实际支付金额） */
    Double payAmount ;
    /** 运费金额 */
    Double freightAmount ;
    /** 促销优惠金额 */
    Double promotionAmount ;



    /** 优惠券优惠金额 */
    Double couponAmount ;

    /** 使用的促销信息 */
    List<Promotion> promotions;


    /** 支付方式 */
    Integer payType ;
    /** 支付账号 */
    String payAccount ;
    /** 商户订单号 */
    String merchantOrderNo ;
    /** 支付流水号 */
    String payFlowNo ;


    /** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
    Integer invoiceType ;
    /** 使用优惠券信息 */
    String couponInfo ;


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

    /** 删除状态：0->未删除；1->已删除 */
    Integer deleteStatus ;

    /** 支付时间 */
    Date paymentTime ;
    /** 发货时间 */
    Date deliveryTime ;
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
