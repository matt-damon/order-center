package order_query;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class Order {
    /** 订单编号 */
    private Long id ;
    /** 源系统id */
    private Integer srcSystemId;
    /** 源系统名称 */
    private String srcSystemName;
    /** 源订单id */
    private Long srcOrderId;
    /** 源订单类型 */
    private Integer srcOrderType;
    /** 用户id */
    private String userId ;
    /** 订单类型 */
    private Integer orderType ;
    /** 渠道编号 */
    private Integer channelId;
    /** 渠道名称 */
    private String channelName;
    /** 门店编号 */
    private String storeId;
    /** 门店名称 */
    private String storeName;

    /** 用户昵称 */
    private String userNickName ;
    /** 买家留言 */
    private String userComments ;

    /** 商品信息 */
    private List<Product> products;
    /** 命中的促销信息 */
    private List<Promotion> promotions;
    /** 使用的优惠券 */
    private List<Coupon> coupons;

    /** 商品数量*/
    private Integer quantity;
    /** 商品总金额（原价） 不含税*/
    private BigDecimal originalAmount ;
    /** 税费 */
    private BigDecimal tax;
    /** 结算金额（实际支付金额） 含税*/
    private BigDecimal totalAmount ;
    /** 促销优惠金额 */
    private BigDecimal promotionAmount ;
    /** 优惠券优惠金额 */
    private BigDecimal couponAmount ;
    /** 积分抵扣金额 */
    private BigDecimal integrationAmount;
    /** 运费金额 */
    private BigDecimal freightAmount;

    /** 支付时间 */
    private Date payTime ;
    /** 支付方式 */
    private Integer payType ;
    /** 支付账号 */
    private String payAccount ;
    /** 商户号 */
    private String merchantId;
    /** 支付流水号 */
    private String payFlowNo ;

    /** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
    private Integer invoiceType ;
    /** 开票状态 */
    private Integer invoiceStatus;
    /** 开票抬头 */
    private String invoiceTitle;
    /** 开票内容（明细或者品类） */
    private String invoiceContent;
    /** 收票人姓名 */
    private String invoiceReceiver;
    /** 收票人手机 */
    private String invoiceReceiverPhone;
    /** 收票人邮箱 */
    private String invoiceReceiverEmail;
    /** 收票人地址 */
    private String invoiceReceiverAddress;

    /** 收货人姓名 */
    private String receiverName ;
    /** 收货人电话 */
    private String receiverPhone ;
    /** 国家编码 */
    private String countryCode ;
    /** 一级地址编码 */
    private String level1AddrCode ;
    /** 二级地址编码 */
    private String level2AddrCode ;
    /** 三级地址编码 */
    private String level3AddrCode ;
    /** 四级地址编码 */
    private String level4AddrCode ;
    /** 详细地址 */
    private String detailAddress ;

    /** 配送方式 */
    private Integer deliveryType;
    /** 发货时效 */
    private Date shippingTimeLimit;
    /** 配送时效*/
    private Date deliveryTimeLimit;
    /** 预约配送时间 */
    private Date deliveryReserveTime;

    /** 下单时间 */
    private Date createTime;
    /** 成交时间 */
    private Date dealTime ;
    /** 评价时间 */
    private Date commentTime ;
    /** 订单状态 */
    private Integer status;
    /** 删除状态：0->未删除；1->已删除 */
    private Integer delete;
}
