package com.stickybytes.Stickybytes.Controller;

import com.stickybytes.Stickybytes.Scopes.ApplicationScopedBean;
import com.stickybytes.Stickybytes.Scopes.RequestScopedBean;
import com.stickybytes.Stickybytes.Scopes.SessionScopedBean;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;

@RestController
@RequestMapping("api/v1/scope")
@RequiredArgsConstructor
public class ScopedController {


    private final  RequestScopedBean requestScopedBean;
    private final SessionScopedBean requestSessionBean;
    private final ApplicationScopedBean requestApplicationScope;




    @GetMapping("/request")
    public ResponseEntity<String> testResponseScope()
    {
        requestScopedBean.setUserName("John Doe");
        return ResponseEntity.ok().body(requestScopedBean.getUserName());

    }



    @GetMapping("/session")
    public ResponseEntity<String> sessionScope()
    {
        requestSessionBean.setUserName("John Doe");
        return ResponseEntity.ok().body(requestSessionBean.getUserName());


    }

    @GetMapping("/application")
    public ResponseEntity<Integer> applicationscope()
    {
        requestApplicationScope.incrementVistorCount();
        return ResponseEntity.ok().body(requestApplicationScope.getVistorcount());


    }

    @GetMapping("/test")
    public ResponseEntity<Integer> testScope()
    {
        return ResponseEntity.ok().body(requestApplicationScope.getVistorcount());

    }

    }
