package order_query;

import cart_v2.ProductAttr;
import cart_v2.SubPromotionItem;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


public class Product {
    Long id;//商品id
    String name;//商品名称
    String brand;//商品品牌
    String category;//商品分类
    String sn;//商品条码
    String imgUrl;//图片链接
    String color;//颜色
    BigDecimal weight;//重量
    String size;//尺寸

    Long storeId;//店铺id
    String storeName;//店铺名称
    String supplierId;//供应商编号
    String supplierName;//供应商名字

    boolean isVirtual;//是否虚拟商品
    boolean isGift;//是否赠品
    boolean isRaiseProduct;//是否加购商品

    Integer quantity;//商品数量
    BigDecimal taxRate;//税率
    BigDecimal originalPrice;//商品原单价
    BigDecimal raiseAmount;//加购金额，用于加价购
    BigDecimal promotionAmount;//促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal freightAmount;//运费金额
    BigDecimal rebateAmount;//返佣金额
    BigDecimal totalAmount;//优惠后的金额
    Integer giftIntegration;//赠送积分

    List<Promotion> promotions; //命中的促销列表

}
