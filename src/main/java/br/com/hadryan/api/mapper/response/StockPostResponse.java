package br.com.hadryan.api.mapper.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockPostResponse {

    private Long id;

    private Long productId;

    private Integer quantity;

    private Integer minQuantity;

    private Integer maxQuantity;

    private Double unitPurchasePrice;

    private Double unitSellPrice;

}
