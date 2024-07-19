package br.com.hadryan.api.controller;

import br.com.hadryan.api.mapper.request.StockPostRequest;
import br.com.hadryan.api.service.producer.StockProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/stocks")
public class StockController {

    private final StockProducer stockProducer;

    @PostMapping
    public ResponseEntity<Void> registerStock(@RequestBody StockPostRequest request) {
        stockProducer.registerStock(request);
        return ResponseEntity.ok().build();
    }

}
