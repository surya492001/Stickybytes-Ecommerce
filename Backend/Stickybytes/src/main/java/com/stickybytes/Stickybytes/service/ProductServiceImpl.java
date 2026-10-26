package com.stickybytes.Stickybytes.service;


import com.stickybytes.Stickybytes.dto.ProductDto;
import com.stickybytes.Stickybytes.entity.Product;
import com.stickybytes.Stickybytes.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;
    @Override
    public List<ProductDto> getProducts() {

        return   productRepository.findAll().stream()
                .map(this::transformtoDTO).collect(Collectors.toList());
    }

    private ProductDto transformtoDTO(Product product)
    {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
}
