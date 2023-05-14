package order_reversal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class AfterSaleOrder {
    Long id;//售后单号
    Integer type;//售后类型，0：退货，1：退货退款
    Integer reason;//售后原因
    Integer productStatus;//货物状态，是否收到货
    List<String> imageUrls;//图片
    String userId;//用户id
    Long orderId;
    String channelId;
    String storeId;

    List<Product> applyProducts;//申请售后商品
    Integer applyQty;//申请售后数量
    BigDecimal applyRefundAmount;//申请退款金额

    //退款
    Long refundNo;//退款单号
    Integer refundType;//退款方式
    Integer refundAmount;//实际退款金额
    Integer refundIntegretion;//退还积分
    BigDecimal refundECardAmount;//退还卡余额
    List<Long> refundCouponIds;//退还的优惠券

    //退货信息
    String returnNo;//退货单号
    String senderName;
    String senderPhone;
    String senderAddress;
    String receiverName;
    String receiverPhone;
    String receiverAddress;

    Integer returnType;//返件方式
    Date pickUpTime;//取件时间
    String deliveryCompany;//退货快递公司
    String deliverySn;//退货快递单号
    BigDecimal returnFreight;//退货运费

    Integer status;//售后单状态
    Date applyTime;//申请时间
    Date updateTime;//最后更新时间

    Date auditTime;//审核时间
    Date auditStatus;//审核状态
    Date auditNote;//审核备注

}
