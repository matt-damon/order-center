package order_generate;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.*;
import java.io.Serializable;

/**
 * 订单商品明细表;
 * @date : 2023-4-19
 */
@ApiModel(value = "订单商品明细表",description = "")
@Table(name="tbl_order_product")
public class OrderProduct implements Serializable,Cloneable{
    /** 订单id */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "订单id",notes = "")
    private Long orderId ;
    /** 商品id */
    @Id
    @GeneratedValue
    @ApiModelProperty(name = "商品id",notes = "")
    private Long productId ;
    /** 店铺id */
    @ApiModelProperty(name = "店铺id",notes = "")
    private Long storeId ;
    /** 店铺名 */
    @ApiModelProperty(name = "店铺名",notes = "")
    private String storeName ;
    /** 商品名 */
    @ApiModelProperty(name = "商品名",notes = "")
    private String productName ;
    /** 商品详情url */
    @ApiModelProperty(name = "商品详情url",notes = "")
    private String productUrl ;
    /** 商品图片 */
    @ApiModelProperty(name = "商品图片",notes = "")
    private String productImg ;
    /** 商品条码 */
    @ApiModelProperty(name = "商品条码",notes = "")
    private String productSn ;
    /** 销售价格 */
    @ApiModelProperty(name = "销售价格",notes = "")
    private Double productPrice ;
    /** 购买数量 */
    @ApiModelProperty(name = "购买数量",notes = "")
    private Integer productQuantity ;
    /** 商品分类id */
    @ApiModelProperty(name = "商品分类id",notes = "")
    private Integer productCategoryId ;
    /** 促销信息:[{"promotion_id":10000,"promotion_name":"直降2元","promotion_amount":2},{"promotion_id":10001,"promotion_name":"满99减10","promotion_amount":5}] */
    @ApiModelProperty(name = "促销信息:[{'promotion_id':10000,'promotion_name':'直降2元','promotion_amount':2}",notes = "")
    private String promotion ;
    /** 商品促销分解金额 */
    @ApiModelProperty(name = "商品促销分解金额",notes = "")
    private Double promotionAmount ;
    /** 优惠券优惠分解金额 */
    @ApiModelProperty(name = "优惠券优惠分解金额",notes = "")
    private Double couponAmount ;
    /** 积分优惠分解金额 */
    @ApiModelProperty(name = "积分优惠分解金额",notes = "")
    private Double integrationAmount ;
    /** 该商品经过优惠后的分解金额 */
    @ApiModelProperty(name = "该商品经过优惠后的分解金额",notes = "")
    private Double realAmount ;
    /** 商品赠送积分 */
    @ApiModelProperty(name = "商品赠送积分",notes = "")
    private Integer giftIntegration ;
    /** 商品赠送成长值 */
    @ApiModelProperty(name = "商品赠送成长值",notes = "")
    private Integer giftGrowth ;
    /** 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}] */
    @ApiModelProperty(name = "商品销售属性:[{\"key\":\"颜色\",\"value\":\"颜色\"},{\"key\":\"容量\",\"value\":\"4G\"}]",notes = "")
    private String productAttr ;

    /** 订单id */
    public Long getOrderId(){
        return this.orderId;
    }
    /** 订单id */
    public void setOrderId(Long orderId){
        this.orderId=orderId;
    }
    /** 商品id */
    public Long getProductId(){
        return this.productId;
    }
    /** 商品id */
    public void setProductId(Long productId){
        this.productId=productId;
    }
    /** 店铺id */
    public Long getStoreId(){
        return this.storeId;
    }
    /** 店铺id */
    public void setStoreId(Long storeId){
        this.storeId=storeId;
    }
    /** 店铺名 */
    public String getStoreName(){
        return this.storeName;
    }
    /** 店铺名 */
    public void setStoreName(String storeName){
        this.storeName=storeName;
    }
    /** 商品名 */
    public String getProductName(){
        return this.productName;
    }
    /** 商品名 */
    public void setProductName(String productName){
        this.productName=productName;
    }
    /** 商品详情url */
    public String getProductUrl(){
        return this.productUrl;
    }
    /** 商品详情url */
    public void setProductUrl(String productUrl){
        this.productUrl=productUrl;
    }
    /** 商品图片 */
    public String getProductImg(){
        return this.productImg;
    }
    /** 商品图片 */
    public void setProductImg(String productImg){
        this.productImg=productImg;
    }
    /** 商品条码 */
    public String getProductSn(){
        return this.productSn;
    }
    /** 商品条码 */
    public void setProductSn(String productSn){
        this.productSn=productSn;
    }
    /** 销售价格 */
    public Double getProductPrice(){
        return this.productPrice;
    }
    /** 销售价格 */
    public void setProductPrice(Double productPrice){
        this.productPrice=productPrice;
    }
    /** 购买数量 */
    public Integer getProductQuantity(){
        return this.productQuantity;
    }
    /** 购买数量 */
    public void setProductQuantity(Integer productQuantity){
        this.productQuantity=productQuantity;
    }
    /** 商品分类id */
    public Integer getProductCategoryId(){
        return this.productCategoryId;
    }
    /** 商品分类id */
    public void setProductCategoryId(Integer productCategoryId){
        this.productCategoryId=productCategoryId;
    }
    /** 促销信息:[{"promotion_id":10000,"promotion_name":"直降2元","promotion_amount":2},{"promotion_id":10001,"promotion_name":"满99减10","promotion_amount":5}] */
    public String getPromotion(){
        return this.promotion;
    }
    /** 促销信息:[{"promotion_id":10000,"promotion_name":"直降2元","promotion_amount":2},{"promotion_id":10001,"promotion_name":"满99减10","promotion_amount":5}] */
    public void setPromotion(String promotion){
        this.promotion=promotion;
    }
    /** 商品促销分解金额 */
    public Double getPromotionAmount(){
        return this.promotionAmount;
    }
    /** 商品促销分解金额 */
    public void setPromotionAmount(Double promotionAmount){
        this.promotionAmount=promotionAmount;
    }
    /** 优惠券优惠分解金额 */
    public Double getCouponAmount(){
        return this.couponAmount;
    }
    /** 优惠券优惠分解金额 */
    public void setCouponAmount(Double couponAmount){
        this.couponAmount=couponAmount;
    }
    /** 积分优惠分解金额 */
    public Double getIntegrationAmount(){
        return this.integrationAmount;
    }
    /** 积分优惠分解金额 */
    public void setIntegrationAmount(Double integrationAmount){
        this.integrationAmount=integrationAmount;
    }
    /** 该商品经过优惠后的分解金额 */
    public Double getRealAmount(){
        return this.realAmount;
    }
    /** 该商品经过优惠后的分解金额 */
    public void setRealAmount(Double realAmount){
        this.realAmount=realAmount;
    }
    /** 商品赠送积分 */
    public Integer getGiftIntegration(){
        return this.giftIntegration;
    }
    /** 商品赠送积分 */
    public void setGiftIntegration(Integer giftIntegration){
        this.giftIntegration=giftIntegration;
    }
    /** 商品赠送成长值 */
    public Integer getGiftGrowth(){
        return this.giftGrowth;
    }
    /** 商品赠送成长值 */
    public void setGiftGrowth(Integer giftGrowth){
        this.giftGrowth=giftGrowth;
    }
    /** 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}] */
    public String getProductAttr(){
        return this.productAttr;
    }
    /** 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}] */
    public void setProductAttr(String productAttr){
        this.productAttr=productAttr;
    }
}
