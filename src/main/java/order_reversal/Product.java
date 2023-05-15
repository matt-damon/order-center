package order_reversal;

import java.math.BigDecimal;


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
}
