package br.com.hadryan.api.mapper.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockPostRequest {

    private Long productId;

    private Integer quantity;

    private Integer minQuantity;

    private Integer maxQuantity;

    private Double unitPurchasePrice;

    private Double unitSellPrice;

}
