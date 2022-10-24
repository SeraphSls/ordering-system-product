package br.com.ordering.system.product.service;

import br.com.ordering.system.product.domain.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductService extends MongoRepository<ProductDTO, String> {



}
