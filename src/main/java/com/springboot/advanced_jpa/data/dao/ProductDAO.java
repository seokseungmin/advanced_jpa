package com.springboot.advanced_jpa.data.dao;


import com.springboot.advanced_jpa.data.entity.Product;

import java.util.Optional;

public interface ProductDAO {

    Product insertProduct(Product product);

    Optional<Product> selectProduct(Long number);

    Product updateProductName(Long number, String namem) throws Exception;

    void deleteProduct(Long number) throws Exception;
}
