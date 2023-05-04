package price_calculate;


import java.util.List;

/**
 * 价格计算服务
 */
public interface PriceCalculateService {


    PriceCalResponse priceCalculate(PriceCalRequest request);

}
