package order_receive;

import java.io.Serializable;
import java.util.Date;


public class Order {
    /** 订单编号 */
    private Long id ;

    /** 用户id */
    private String userId ;

    /** 订单类型 */
    private Integer orderType ;

    /** 销售平台 */
    private Integer salePlatform;

    /** 店铺id */
    private String storeId;

    /** 源系统id */
    private Integer srcSystemId;

    /** 源系统名称 */
    private String srcSystemName;

    /** 源订单类型 */
    private Integer srcOrderType ;

    /** 源订单id */
    private Long srcOrderId;

    /** 下单时间 */
    private Date createTime;

    /** 订单状态 */
    private Integer status;

    /** 用户昵称 */
    private String userNickName ;

    /** 买家留言 */
    private String userComments ;

    /** 组织编码 */
    private String orgCode ;

    /** 组织名称 */
    private String orgName ;

    /** 订单总金额 */
    private Double totalAmount ;

    /** 应付金额（实际支付金额） */
    private Double payAmount ;

    /** 运费金额 */
    private Double freightAmount ;

    /** 促销优惠金额 */
    private Double promotionAmount ;

    /** 使用的促销信息 */
    private String promotionInfo ;

    /** 优惠券优惠金额 */
    private Double couponAmount ;

    /** 支付方式 */
    private Integer payType ;

    /** 支付账号 */
    private String payAccount ;

    /** 商户订单号 */
    private String merchantOrderNo ;

    /** 支付流水号 */
    private String payFlowNo ;

    /** 发票类型：0->不开发票；1->电子发票；2->纸质发票 */
    private Integer invoiceType ;

    /** 使用优惠券信息 */
    private String couponInfo ;

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

    /** 删除状态：0->未删除；1->已删除 */
    private Integer deleteStatus ;

    /** 支付时间 */
    private Date paymentTime ;

    /** 发货时间 */
    private Date deliveryTime ;

    /** 评价时间 */
    private Date commentTime ;

    /** 修改时间 */
    private Date modifyTime ;

    /** 配送方式 */
    private Integer deliveryType ;

    /** 配送单号 */
    private String deliverySn ;

    /** 配送公司 */
    private String deliveryCompany ;

    /** 预约配送时间 */
    private Date deliveryReserveTime ;

    /** 发货时效 */
    private Date shippingTimeLimit ;

    /**  */
    private Date deliveryTimeLimit ;

}
