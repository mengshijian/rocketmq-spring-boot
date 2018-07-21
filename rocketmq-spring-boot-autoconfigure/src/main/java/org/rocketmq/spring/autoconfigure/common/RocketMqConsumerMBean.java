package org.rocketmq.spring.autoconfigure.common;

import java.util.List;

/**
 * @author mengsj
 * @since 0.0.1
 */
public class RocketMqConsumerMBean{

    /**
     * consumer beans container.
     *
     */
    private List<AbstractRocketMqConsumer> consumers;

    public List<AbstractRocketMqConsumer> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<AbstractRocketMqConsumer> consumers) {
        this.consumers = consumers;
    }

}
