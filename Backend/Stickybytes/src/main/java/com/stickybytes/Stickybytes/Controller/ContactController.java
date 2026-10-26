package com.stickybytes.Stickybytes.Controller;

import com.stickybytes.Stickybytes.dto.ContactRequestDto;
import com.stickybytes.Stickybytes.service.impl.IContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.health.actuate.endpoint.HttpCodeStatusMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/contacts")
@RequiredArgsConstructor

//@CrossOrigin(origins = "http://localhost:5173/")
public class ContactController
{
    private final IContactService iContactService;
    private final HttpCodeStatusMapper httpCodeStatusMapper;


    @PostMapping
    public ResponseEntity<String> saveContact(
             @RequestBody ContactRequestDto contactRequestDto) {
        iContactService.saveContact(contactRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Request processed successfully");
    }


}
