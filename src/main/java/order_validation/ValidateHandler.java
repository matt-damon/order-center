package order_validation;

public abstract class ValidateHandler {

    ValidateHandler next;

    public abstract boolean validate(CheckParam checkParam);

    public void setNext(ValidateHandler handler) {};

}
