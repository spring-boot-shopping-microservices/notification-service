package org.example.notificationservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {
  @KafkaListener(topics = "notificationTopic", groupId = "notification-service-group")
  public void listen(String orderId) {
    log.info("Order received with order id : {}", orderId);
  }
}
