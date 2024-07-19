package br.com.hadryan.api.service.producer;

import br.com.hadryan.api.mapper.request.ProductPostRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.product.queue}")
    private String queue;

    @Value("${rabbitmq.product.exchange}")
    private String exchange;

    public void sendProductRegister(ProductPostRequest message) {
        log.info("Sending product to register: {}", message);
        rabbitTemplate.convertAndSend(exchange, queue, message);
    }

}
