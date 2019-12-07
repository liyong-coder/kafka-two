package com.hyzs.kafkatwo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * kakfa消费者
 * @author gehaiyang
 */
@Component
public class KafkaConsumerListener {



	@KafkaListener(topics = {"today_scheduled_users"})
    public void zfListen(@Payload String msg) throws IOException {
		System.out.println("zfReceiver"+msg);
	}

	@KafkaListener(topics = {"today_scheduled_users"},containerFactory = "kafkaListenerContainerClwFactory")
	public void clwListen(@Payload String msg) throws IOException {
		System.out.println("clwReceiver"+msg);
	}


}
