package order_validation;

import java.util.HashMap;
import java.util.Map;

public class ValidateChainFactory {

    Map<String, ValidateChain> chainMap;

    void init() { }

    ValidateChain getValidateChain(Object param) {
        return new ValidateChain();
    }
}
