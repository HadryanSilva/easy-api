package br.com.hadryan.api.mapper.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalePostResponse {

    private Long id;
    private Long productId;
    private Long userId;
    private Integer quantity;
    private Double price;
    private Double total;

}
