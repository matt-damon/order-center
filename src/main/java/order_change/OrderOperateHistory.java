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
@ApiModel(value = "订单操作记录表",description = "")
@Table(name="tbl_order_operate_history")
public class OrderOperateHistory implements Serializable,Cloneable{
    /**  */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "",notes = "")
    private Long id ;
    /**  */
    @ApiModelProperty(name = "",notes = "")
    private Long orderId ;
    /** 操作人 */
    @ApiModelProperty(name = "操作人",notes = "")
    private String operateMan ;
    /** 操作时间 */
    @ApiModelProperty(name = "操作时间",notes = "")
    private Date operateTime ;
    /** 订单状态 */
    @ApiModelProperty(name = "订单状态",notes = "")
    private Integer orderStatus ;
    /** 备注 */
    @ApiModelProperty(name = "备注",notes = "")
    private String note ;

    /**  */
    public Long getId(){
        return this.id;
    }
    /**  */
    public void setId(Long id){
        this.id=id;
    }
    /**  */
    public Long getOrderId(){
        return this.orderId;
    }
    /**  */
    public void setOrderId(Long orderId){
        this.orderId=orderId;
    }
    /** 操作人 */
    public String getOperateMan(){
        return this.operateMan;
    }
    /** 操作人 */
    public void setOperateMan(String operateMan){
        this.operateMan=operateMan;
    }
    /** 操作时间 */
    public Date getOperateTime(){
        return this.operateTime;
    }
    /** 操作时间 */
    public void setOperateTime(Date operateTime){
        this.operateTime=operateTime;
    }
    /** 订单状态 */
    public Integer getOrderStatus(){
        return this.orderStatus;
    }
    /** 订单状态 */
    public void setOrderStatus(Integer orderStatus){
        this.orderStatus=orderStatus;
    }
    /** 备注 */
    public String getNote(){
        return this.note;
    }
    /** 备注 */
    public void setNote(String note){
        this.note=note;
    }
}
