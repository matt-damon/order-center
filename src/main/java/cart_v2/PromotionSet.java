package cart_v2;

import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

/**
 * 按促销聚合
 */
@Data
public class PromotionSet {
    Promotion promotion;
    List<Product> products;//主品
    List<Product> subProducts;//子品

    BigDecimal originTotalAmount;//商品总额(优惠前)
    BigDecimal totalAmount;//优惠后总金额
}
