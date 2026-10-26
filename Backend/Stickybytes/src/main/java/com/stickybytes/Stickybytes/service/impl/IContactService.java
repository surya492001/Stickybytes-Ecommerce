package com.stickybytes.Stickybytes.service.impl;

import com.stickybytes.Stickybytes.dto.ContactRequestDto;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);

}