package br.com.ordering.system.product.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    private String name;

    private Integer inventory;
    private String content;
    private String applicationVideo;
    private BigDecimal price;
    private String description;
    private String howToUse;

    public ProductRequest(String name, String id, Integer inventory, String content, String applicationVideo, BigDecimal price, String description, String howToUse) {
        this.name = name;
        this.inventory = inventory;
        this.content = content;
        this.applicationVideo = applicationVideo;
        this.price = price;
        this.description = description;
        this.howToUse = howToUse;
    }
}
