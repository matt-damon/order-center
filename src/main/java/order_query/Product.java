package order_query;

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



    Integer quantity;//商品数量


    List<Promotion> promotions; //命中的促销列表

}
