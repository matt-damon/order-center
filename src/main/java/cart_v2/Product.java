package cart_v2;

import java.math.BigDecimal;
import java.util.List;

public class Product {
    Long id;//商品id，套装id
    boolean checked;//是否选中

    List<Product> products;//套装商品

    SkuAttr skuAttr;//商品属性

    //库存相关
    Integer quantity;//商品数量
    Integer stock;//库存
    Integer limitBuyQuantity;//限购数

    BigDecimal originalPrice;//商品原单价
    BigDecimal raiseAmount;//加购金额，用于加价购

    Long addCartTs;//加入购物车时间
    Long lastUpdateTs;//最后操作时间

    List<Promotion> promotions; //单品促销
    List<Promotion> allPromotions;//所有促销列表


}
