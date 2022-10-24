package br.com.ordering.system.product.controller;


import br.com.ordering.system.product.domain.ProductDTO;
import br.com.ordering.system.product.request.ProductRequest;
import br.com.ordering.system.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;


    @PostMapping(value = "/insert")
    public ResponseEntity<Object> insertProduct(@RequestBody ProductRequest product) {
        ProductDTO productDTO = new ProductDTO(product);
        productService.insert(productDTO);
        return new ResponseEntity<Object>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/recover")
    public ResponseEntity<Object> recoverProduct() {
        return new ResponseEntity<Object>(productService.findAll(), HttpStatus.OK);
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Object> updateProduct(@RequestBody ProductRequest product) {
        ProductDTO prod = productService.findByProductCode(product.getProductCode());
        if(prod == null){
            productService.save(new ProductDTO(product));
        }
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }




}
