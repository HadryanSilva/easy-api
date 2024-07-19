package br.com.hadryan.api.controller;

import br.com.hadryan.api.mapper.request.ProductPostRequest;
import br.com.hadryan.api.service.producer.ProductProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductProducer productProducer;

    @PostMapping
    public ResponseEntity<Void> registerProduct(@RequestBody ProductPostRequest request) {
        productProducer.sendProductRegister(request);
        return ResponseEntity.ok().build();
    }

}
