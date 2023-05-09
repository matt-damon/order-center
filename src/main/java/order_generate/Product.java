package order_generate;

import price_calculate.Coupon;
import price_calculate.Promotion;

import java.math.BigDecimal;
import java.util.List;


public class Product {
    Long id;//商品id
    Integer quantity;//商品数量
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
    Integer storeType;//店铺类型
    String supplierId;//供应商编号
    String supplierName;//供应商名字
    Boolean isVirtual;//是否虚拟商品
    Boolean isGift;//是否赠品
    Boolean isAddBuy;//是否加购商品
    Boolean isReturn;//是否可退

    Promotion parentPromotion;//父级促销
    List<Promotion> promotions; //指定或命中的促销列表
    List<Coupon> coupons;//优惠券分摊情况，入参不用

    BigDecimal originalAmount;//商品原价
    BigDecimal promotionAmount;//促销优惠（减免）金额
    BigDecimal soldAmount;//成交金额（活动价）=商品原价-促销优惠金额
    BigDecimal couponAmount;//优惠券抵扣金额
    Integer integration;//抵扣积分
    BigDecimal integrationAmount; //积分抵扣金额
    BigDecimal eCardAmount;//电子卡余额抵扣金额
    BigDecimal paidAmount;//实付金额=成交金额-优惠券抵扣金额-积分抵扣金额-电子卡余额抵扣金额

}
