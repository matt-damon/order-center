package order_reversal;

import java.util.Date;

public class AfterSaleOrderOperateHistory {
    private Long id ;//变更记录id

    private Long afterSaleOrderId;//售后单id

    private Integer changeType;//变更类型

    private String operator ;//变更人或系统

    private Date changeTime ;//变更时间

    private String content;//变更内容

    private String note ;//备注
}
