package order_change.change_rule;


public class ChangeRule {
    Long id;//规则id,自增
    Integer orderType;//订单类型
    Integer orderStatus;//订单状态
    Integer fieldId;//变更字段id
    Boolean active;//是否生效
}
