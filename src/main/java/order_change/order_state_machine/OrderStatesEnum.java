package order_change.order_state_machine;

public enum OrderStatesEnum {

    TO_PAID("未支付", 0),
    TO_DELIVER("待发货", 1),
    TO_RECEIVE("待收货", 2),
    COMPLETE("完成", 3);

    private String name;
    private int code;

    OrderStatesEnum(String name, int code) {
        this.name = name;
        this.code = code;
    }

}
