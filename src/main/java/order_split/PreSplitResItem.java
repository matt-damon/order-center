package order_split;

import order_query.Coupon;
import order_query.Product;
import order_query.Promotion;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/** 预拆分结果
 * 按storeId+join(productId)
 */
public class PreSplitResItem {

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
}
