package order_change;


public class ChangeRule {
    Long id;//规则id,自增
    Integer orderType;//订单类型
    Integer status;//订单状态
    Long fieldId;//变更字段id
    Boolean active;//是否生效
}
