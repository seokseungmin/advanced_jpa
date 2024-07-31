package com.springboot.advanced_jpa.service.impl;


import com.springboot.advanced_jpa.data.repository.ProductRepository;
import com.springboot.advanced_jpa.service.ProductService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@Import({ProductServiceImpl.class})
public class ProductServiceTest2 {

    @MockBean
    ProductRepository productRepository;

    ProductService productService;
}
