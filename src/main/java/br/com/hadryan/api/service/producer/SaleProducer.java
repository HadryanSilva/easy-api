package br.com.hadryan.api.service.producer;

import br.com.hadryan.api.mapper.request.SalePostRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class SaleProducer {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.sales.queue}")
    private String queue;

    @Value("${rabbitmq.sales.exchange}")
    private String exchange;

    public void sendSale(SalePostRequest message) {
        log.info("Sending sale to save: {}", message);
        rabbitTemplate.convertAndSend(exchange, queue, message);
    }

}
