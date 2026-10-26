package com.stickybytes.Stickybytes.repository;

import com.stickybytes.Stickybytes.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}