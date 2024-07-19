package br.com.hadryan.api.mapper.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductPostRequest {

    private String name;
    private String description;
    private String brand;

}
