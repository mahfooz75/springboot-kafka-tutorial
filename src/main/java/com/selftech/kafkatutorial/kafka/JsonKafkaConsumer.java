package com.selftech.kafkatutorial.kafka;

import com.selftech.kafkatutorial.constant.KafkaConstant;
import com.selftech.kafkatutorial.payload.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class JsonKafkaConsumer {

    @KafkaListener(topics = KafkaConstant.JAVA_GUIDE_JSON_TOPIC, groupId = KafkaConstant.GROUP_ID)
    public void consumeJsonMessage(User user) {
        log.info(String.format("Json Message Received -> %s", user.toString()));
    }

}
