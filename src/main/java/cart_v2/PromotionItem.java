package cart_v2;

import java.math.BigDecimal;
import java.util.List;

/**
 * 按促销聚合
 */
public class PromotionItem {

    List<Product> products;//主品
    Promotion promotion;

    BigDecimal originTotalAmount;//优惠前总额
    BigDecimal totalAmount;//优惠后总金额

    public static void main(String[] args) {

        Cart cart = new Cart();


        System.out.println(System.currentTimeMillis());
    }
}
