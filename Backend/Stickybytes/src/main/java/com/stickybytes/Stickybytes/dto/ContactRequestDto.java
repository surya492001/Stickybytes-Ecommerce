package com.stickybytes.Stickybytes.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
public class ContactRequestDto {


    private String name;

    private String email;

    private String mobileNumber;

    private String message;



}
