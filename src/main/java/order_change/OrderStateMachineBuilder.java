package order_change;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.action.Action;
import org.springframework.statemachine.config.StateMachineBuilder;
import org.springframework.stereotype.Component;
import java.util.EnumSet;

@Component
public class OrderStateMachineBuilder {
    private final static String MACHINE_ID = "orderMachine";

    public StateMachine build(BeanFactory beanFactory) throws Exception {
        StateMachineBuilder.Builder<OrderStatesEnum, OrderEventsEnum> builder = StateMachineBuilder.builder();

        System.out.println("构建订单状态机");

        builder.configureConfiguration()
                .withConfiguration()
                .machineId(MACHINE_ID)
                .beanFactory(beanFactory);

        builder.configureStates()
                .withStates()
                .initial(OrderStatesEnum.TO_PAID)
                .states(EnumSet.allOf(OrderStatesEnum.class));

        builder.configureTransitions()
                .withExternal()
                .source(OrderStatesEnum.TO_PAID).target(OrderStatesEnum.TO_DELIVER)
                .event(OrderEventsEnum.PAY)
                .and()
                .withExternal()
                .source(OrderStatesEnum.TO_DELIVER).target(OrderStatesEnum.TO_RECEIVE)
                .event(OrderEventsEnum.SHIP);
        return builder.build();
    }

    @Bean
    public Action action() {
        return new Action() {
            @Override
            public void execute(StateContext context) {
                System.out.println(context);
            }
        };
    }
}
