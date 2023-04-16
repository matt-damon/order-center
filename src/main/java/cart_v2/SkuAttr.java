package cart_v2;

import java.math.BigDecimal;

/**
 * 商品属性类
 */
public class SkuAttr {

    String storeId;//店铺id
    String storeName;//店铺名称
    String skuName;//商品名称
    String skuImageUrl;//图片链接
    String color;//颜色
    BigDecimal weight;//重量
    String size;//尺寸
    String sellingUnit;//售卖单位，油气氢电服
    Integer status;//商品状态
    boolean isVirtual;//是否虚拟商品
}
