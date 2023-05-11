package order_change.order_state_machine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.statemachine.StateMachine;

import java.util.List;
import java.util.Map;

/**
 * 状态机Builder工厂
 */
public class BizStateMachineBuildFactory implements InitializingBean {

    /**
     * 用于存储bizType+subBizType 与 builder-name的集合
     */
    Map<String, String> bizTypeBuilderMap;

    /**
     * 用来存储builder-name及builder的map
     */
    Map<String, BizStateMachineBuilder> builderMap;

    /**
     * builder集合
     */
    List<BizStateMachineBuilder> builders;

    /**
     * 根据不同业务类型创建不同状态机
     * @param bizType
     * @param subBizType
     * @return
     */
    public StateMachine<OrderStatesEnum, OrderEventsEnum> createStateMachine(String bizType, String subBizType) {
        return null;
    }



    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
