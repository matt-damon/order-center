package order_reversal;

import java.util.Date;

public class AfterSaleOperateRecord {
    private Long id ;//变更记录id

    private Long afterSaleOrderId;//售后单id

    private Integer operateType;//变更类型

    private String operator ;//变更人或系统

    private Date operateTime ;//变更时间

    private String content;//变更内容

    private String note ;//备注
}
