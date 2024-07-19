package br.com.hadryan.api.controller;

import br.com.hadryan.api.mapper.request.SalePostRequest;
import br.com.hadryan.api.service.producer.SaleProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    private final SaleProducer saleProducer;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody SalePostRequest request) {
        saleProducer.sendSale(request);
        return ResponseEntity.ok().build();
    }

}
