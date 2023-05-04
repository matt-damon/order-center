package order_validation;

import common.APIResult;
import order_receive.Order;

public interface ValidateService {

    APIResult validateOrder(CheckParam param);

}
