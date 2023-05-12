package order_change;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单操作记录表
 */

public class OrderChangeHistory implements Serializable,Cloneable{

    private Long id ;//变更记录id

    private Long orderId;//订单id

    private Integer changeType;//变更类型

    private String operator ;//变更人

    private Date changeTime ;//变更时间

    private String beforeContent;//变更前内容

    private String afterContent;//变更后内容

    private String note ;//备注

}
