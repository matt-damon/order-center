package order_validation;


import java.util.List;

public class CheckParam {
    /** 事件类型 */
    private Integer eventType;
    /** 订单编号 */
    private Long id ;
    /** 源系统id */
    private Integer srcSystemId;
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
    /** 门店编号 */
    private String storeId;

    /** 商品信息 */
    private List<Product> products;
    /** 命中的促销信息 */
    private List<Promotion> promotions;
    /** 使用的优惠券 */
    private List<Coupon> coupons;

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
}
