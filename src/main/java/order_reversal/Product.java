package order_reversal;

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
    Boolean isVirtual;//是否虚拟商品
    Boolean isGift;//是否赠品
    Boolean isAddBuy;//是否加购商品

    Integer applyQty;//申请售后数量
    Integer refundAmount;//退还金额
    Integer refundIntegretion;//退还积分
    BigDecimal refundECardAmount;//退还卡余额


}
