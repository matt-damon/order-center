package order_change;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.statemachine.StateMachine;

public interface BizStateMachineBuilder {

    // 业务一对应的builder name
    String BIZ_ONE_BUILDER_NAME = "bizOneStateMachineBuilder";
    // 业务二对应的builder name
    String BIZ_TWO_BUILDER_NAME = "bizTwoStateMachineBuilder";

    String getName();

    StateMachine<OrderStatesEnum, OrderEventsEnum> build(BeanFactory beanFactory) throws Exception;

}
