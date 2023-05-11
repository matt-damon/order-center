package order_change.order_state_machine;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.common.annotation.AnnotationBuilder;

public class BizTwoStateMachineBuilder extends EnumStateMachineConfigurerAdapter implements BizStateMachineBuilder {

    @Override
    public String getName() {
        return BIZ_TWO_BUILDER_NAME;
    }

    @Override
    public StateMachine<OrderStatesEnum, OrderEventsEnum> build(BeanFactory beanFactory) throws Exception {
        return null;
    }

    @Override
    public void init(AnnotationBuilder annotationBuilder) throws Exception {

    }

    @Override
    public void configure(AnnotationBuilder annotationBuilder) throws Exception {

    }
}
