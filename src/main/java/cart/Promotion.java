package cart;

import java.math.BigDecimal;
import java.util.List;

public abstract class Promotion {
    Long promoId;//促销ID
    String name;//促销名称
    Integer type;//促销类型
    BigDecimal money;//起送金额
    //..其他规则
}
