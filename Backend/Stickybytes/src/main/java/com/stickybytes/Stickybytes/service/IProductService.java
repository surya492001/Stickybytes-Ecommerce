package com.stickybytes.Stickybytes.service;

import com.stickybytes.Stickybytes.dto.ProductDto;


import java.util.List;

public interface IProductService {

    List<ProductDto> getProducts();
}
