package br.com.hadryan.api.mapper.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalePostRequest {

    private Long productId;
    private Long userId;
    private Integer quantity;
    private Double price;
    private Double total;

}
