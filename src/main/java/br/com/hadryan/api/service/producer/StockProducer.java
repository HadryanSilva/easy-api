package br.com.hadryan.api.service.producer;

import br.com.hadryan.api.mapper.request.StockPostRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class StockProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.stock.queue}")
    private String queue;

    @Value("${rabbitmq.stock.exchange}")
    private String exchange;

    public void registerStock(StockPostRequest message) {
        log.info("Sending stock to register: '{}'", message);
        rabbitTemplate.convertAndSend(exchange, queue, message);
    }

}
