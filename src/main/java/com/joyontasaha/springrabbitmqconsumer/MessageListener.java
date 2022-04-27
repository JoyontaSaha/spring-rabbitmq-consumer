package com.joyontasaha.springrabbitmqconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE_1)
    public void listener1(CustomMessage message) {
        log.info("Message Listen1 :: {}", message);
    }

    @RabbitListener(queues = MQConfig.QUEUE_2)
    public void listener2(CustomMessage message) {
        log.info("Message Listen2 :: {}", message);
    }

}
