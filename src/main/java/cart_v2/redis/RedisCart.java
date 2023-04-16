package cart_v2.redis;

import cart_v2.StoreItem;

import java.util.List;

//存放到redis的结构
public class RedisCart {
    String userId;//用户id
    List<StoreItem> storeItems;//店铺列表
}
