package ykpractice.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProducerController {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("sendToKafka")
    public void sendToKafka() {
        kafkaTemplate.send("yk", "Hello, yk!");
    }

}
