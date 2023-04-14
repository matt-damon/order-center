package cart;

import java.math.BigDecimal;
import java.util.List;

//单品
public class SkuItem {

    String skuId;//商品id，主键
    boolean checked;//是否选中

    //商品相关
    String skuName;//商品名称
    String storeId;//店铺id
    String storeName;//店铺名称
    String skuImageUrl;//图片链接
    String color;//颜色
    BigDecimal weight;//重量
    String size;//尺寸
    String sellingUnit;//售卖单位，油气氢电服
    Integer status;//商品状态
    boolean isVirtual;//是否虚拟商品

    //库存相关
    Integer quantity;//商品数量
    Integer stock;//库存
    Integer limitBuyQuantity;//限购数

    //促销相关
    boolean isGift;//是否赠品
    BigDecimal originalPrice;//商品原单价

    /**
     * 单品促销，包含直降，折扣，特价
     */
    BigDecimal reduceAmount; //直降金额，促销价=原单价-直降金额
    BigDecimal discount;//折扣，促销价=原单价*折扣
    BigDecimal specialOffer;//特价


    BigDecimal promotionOfferAmount;//促销优惠金额



    BigDecimal raiseAmount;//加购金额，用于加价购
    List<SkuItem> gifts;//单品促销的赠品
    List<Promotion> promotions;//命中的促销

}
