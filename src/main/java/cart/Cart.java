package cart;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 购物车
 */
@Data
public class Cart {
    String userId;//用户id
    String memberId;//会员id

    Integer totalLimitQuantity;//购物车限制商品最大数量
    Integer totalQuantity;//购物车商品总数

    List<StoreItem> storeItems;//店铺列表

    Promotion promotion;//购物车级别的促销，整车促销

    BigDecimal originTotalAmount;//商品优惠前总额
    BigDecimal promotionOfferAmount;//促销优惠金额
    BigDecimal couponOfferAmount; //优惠券抵扣总金额
    BigDecimal totalOfferAmount;  //优惠总金额
    BigDecimal totalAmount; //购物车结算总金额（优惠后）

    public static void main(String[] args) {
        Cart cart = new Cart();

        //Store1
        StoreItem storeItem1 = new StoreItem();
        storeItem1.setId(1L);
        storeItem1.setIsCrossStore(Boolean.FALSE);
        storeItem1.setLastUpdateTs(System.currentTimeMillis());

        Product product1 = new Product();
        product1.setId(10000L);
        product1.setStoreId(100L);
        product1.setChecked(false);
        product1.setQuantity(2);
        product1.setAddCartTs(System.currentTimeMillis() - 1000);
        product1.setLastUpdateTs(System.currentTimeMillis());
        storeItem1.setProducts(Arrays.asList(product1));


        //Store2
        StoreItem storeItem2 = new StoreItem();
        storeItem2.setId(2L);
        storeItem2.setIsCrossStore(Boolean.FALSE);
        storeItem2.setLastUpdateTs(System.currentTimeMillis() - 123);


        PromotionSet multiPromotionItem = new PromotionSet();
        Promotion promotion = new Promotion();
        promotion.setId(900000L);
        promotion.setType(2);

        Product product2 = new Product();
        product2.setId(20000L);
        product2.setStoreId(201L);
        product2.setChecked(false);
        product2.setQuantity(3);
        product2.setAddCartTs(System.currentTimeMillis() - 30010);
        product2.setLastUpdateTs(System.currentTimeMillis() - 2376);

        Product product3 = new Product();
        product3.setId(30000L);
        product3.setStoreId(201L);
        product3.setChecked(false);
        product3.setQuantity(1);
        product3.setAddCartTs(System.currentTimeMillis() - 3010);
        product3.setLastUpdateTs(System.currentTimeMillis() - 5376);

        List<Product> products = new ArrayList<>();
        products.add(product2);
        products.add(product3);
        multiPromotionItem.setPromotion(promotion);
        multiPromotionItem.setProducts(products);

        storeItem2.setMultiPromotionItems(Arrays.asList(multiPromotionItem));

        cart.setUserId("ej88888");
        cart.setStoreItems(Arrays.asList(storeItem1, storeItem2));
        System.out.println(JSONObject.toJSONString(cart));
    }


}
