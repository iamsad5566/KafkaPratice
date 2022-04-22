package ykpractice.kafka;

import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "yk",
            groupId = "testGroup"
    )
    public ResponseEntity listener(String data) {
        System.out.print("Hello, here's what I got: " + data);
        return ResponseEntity.accepted().build();
    }

}
