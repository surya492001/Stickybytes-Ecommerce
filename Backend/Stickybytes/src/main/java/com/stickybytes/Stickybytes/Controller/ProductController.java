package com.stickybytes.Stickybytes.Controller;

import com.stickybytes.Stickybytes.dto.ErrorResponseDto;
import com.stickybytes.Stickybytes.dto.ProductDto;
import com.stickybytes.Stickybytes.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:5173/")
public class ProductController
{
    private final IProductService iProductService;


    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() throws InterruptedException {
        List <ProductDto> productList =iProductService.getProducts();
        return ResponseEntity.ok().body(productList);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalException(Exception exception,
                                                                  WebRequest webRequest) {
        ErrorResponseDto errorResponseDto = new ErrorResponseDto(
                webRequest.getDescription(false), HttpStatus.SERVICE_UNAVAILABLE,
                exception.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorResponseDto, HttpStatus.SERVICE_UNAVAILABLE);
    }


}
