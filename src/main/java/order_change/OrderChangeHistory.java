package order_change;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 订单操作记录表;
 * @author : http://www.chiner.pro
 * @date : 2023-4-19
 */

public class OrderChangeHistory implements Serializable,Cloneable{

    private Long id ;

    private Long orderId ;

    private String operateMan ;

    private Date operateTime ;

    private Integer orderStatus ;

    private String note ;

}
