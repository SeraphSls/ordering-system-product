package br.com.ordering.system.product.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    private String name;
    private Integer productCode;
    private Integer inventory;
    private String content;
    private String applicationVideo;
    private BigDecimal price;
    private String description;
    private String howToUse;

    public ProductRequest(String name, Integer productCode, Integer inventory, String content, String applicationVideo, BigDecimal price, String description, String howToUse) {
        this.name = name;
        this.productCode = productCode;
        this.inventory = inventory;
        this.content = content;
        this.applicationVideo = applicationVideo;
        this.price = price;
        this.description = description;
        this.howToUse = howToUse;
    }
}
