package com.stickybytes.Stickybytes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class ProductDto {

    private Long productid;
    private String name;

    private String description;

    private BigDecimal price;

    private Integer popularity;

    private String imageUrl;

    private Instant createdAt;


}
