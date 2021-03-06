package com.selftech.kafkatutorial.kafka;

import com.selftech.kafkatutorial.constant.KafkaConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = KafkaConstant.JAVA_GUIDE_TOPIC, groupId = KafkaConstant.GROUP_ID)
    public void consume(String message) {
        log.info(String.format("Message received -> %s", message));
    }

}
