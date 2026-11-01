package com.stickybytes.Stickybytes.Scopes;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.ApplicationScope;

@Slf4j
@Component
@ApplicationScope @Getter

public class ApplicationScopedBean {

    private int Vistorcount;

    public void incrementVistorCount()
    {
        Vistorcount++;
    }
    public ApplicationScopedBean() {

    log.info("ApplicationBean");
    }
}
