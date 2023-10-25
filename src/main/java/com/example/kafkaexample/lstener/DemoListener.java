package com.example.kafkaexample.lstener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@Slf4j
@EnableBinding(Sink.class)
public class DemoListener {
    @StreamListener("input")
    public void broadcasted(String message) {
        log.info("Message from topic demo: " + message);
    }
}
