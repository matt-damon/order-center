package order_split;

import java.util.List;

public class PreSplitRequest {
    String userid;

    //运费计算和地址相关
    /** 国家编码 */
    String countryCode ;
    /** 一级地址编码 */
    String level1AddrCode ;
    /** 二级地址编码 */
    String level2AddrCode ;
    /** 三级地址编码 */
    String level3AddrCode ;
    /** 四级地址编码 */
    String level4AddrCode ;
    /** 详细地址 */
    String detailAddress ;

    List<Product> products;
}
