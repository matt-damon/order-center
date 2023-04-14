package cart;

import java.math.BigDecimal;
import java.util.List;

//套装
public class Suit {
    private String suitId;//套装id
    private List<SkuItem> suitItems;//套装商品
    private BigDecimal totalAmount;//套装总价
    boolean checked;//是否选中
}
