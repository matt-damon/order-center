package order_validation;

import common.APIResult;

public interface ValidateService {

    APIResult validateOrder(CheckParam param);

}
