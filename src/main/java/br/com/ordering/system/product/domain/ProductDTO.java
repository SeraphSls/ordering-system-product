package br.com.ordering.system.product.domain;


import br.com.ordering.system.product.request.ProductRequest;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;

@Document("products")
@Data
public class ProductDTO {
    @MongoId(FieldType.STRING)
    private String id;
    private String name;
    private Integer inventory;
    private String content;
    private String applicationVideo;
    private BigDecimal price;
    private String description;
    private String howToUse;

    public ProductDTO(String id, String name, Integer inventory, String content, String applicationVideo, BigDecimal price, String description, String howToUse) {
        this.id = id;
        this.name = name;
        this.inventory = inventory;
        this.content = content;
        this.applicationVideo = applicationVideo;
        this.price = price;
        this.description = description;
        this.howToUse = howToUse;
    }

    public ProductDTO() {

    }

    public ProductDTO(ProductRequest request) {
        this.name = request.getName();
        this.inventory = request.getInventory();
        this.content = request.getContent();
        this.applicationVideo = request.getApplicationVideo();
        this.price = request.getPrice();
        this.description = request.getDescription();
        this.howToUse = request.getHowToUse();
    }
}
