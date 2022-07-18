package com.selftech.kafkatutorial.controller;

import com.selftech.kafkatutorial.kafka.JsonKafkaProducer;
import com.selftech.kafkatutorial.payload.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {
    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return new ResponseEntity<>("Json Message sent on topic javaguides", HttpStatus.OK);
    }
}
