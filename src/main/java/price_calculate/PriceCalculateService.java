package price_calculate;

/**
 * 价格计算服务
 */
public interface PriceCalculateService {
    PriceCalResponse priceCalculate(PriceCalRequest request);
}
