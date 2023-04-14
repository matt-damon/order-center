package cart;

import java.util.List;

//加价购，主品对多个加购商品，算满减?
public class RaiseBuySuit extends Promotion {
    SkuItem mainItem;//主品
    List<SkuItem> raiseItems;//换购的商品列表
}
