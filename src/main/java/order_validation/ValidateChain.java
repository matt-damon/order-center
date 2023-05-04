package order_validation;

import java.util.List;

public class ValidateChain {

    ValidateHandler head;

    public boolean validate(CheckParam checkParam) {
        if (head != null) {
            return head.validate(checkParam);
        }
        return false;
    }
}
