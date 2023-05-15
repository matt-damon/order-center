package cart;

import lombok.Data;
import order_query.Promotion;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Product {
    Long id;//商品id，套装id
    Long storeId;//店铺id
    String storeName;//店铺名称
    Boolean checked;//是否选中
    List<Product> products;//套装商品
    ProductAttr productAttr;//商品属性
    //库存相关
    Integer quantity;//商品数量
    Integer stock;//库存
    Integer limitBuyQuantity;//限购数

    BigDecimal originalPrice;//商品原单价
    BigDecimal addBuyAmount;//加购金额，用于加价购

    Long addCartTs;//加车时间
    Long lastUpdateTs;//最后操作时间

    Promotion parentPromotion;//上级促销信息
    boolean isGift;//是否赠品
    boolean isAddBuy;//是否加价购商品
    List<Product> gifts;//赠品
    List<Product> addBuyProducts;//加购商品

    List<Promotion> promotions;//促销列表
}
