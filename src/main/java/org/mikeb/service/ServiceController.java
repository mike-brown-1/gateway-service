package org.mikeb.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ServiceController {
    private ServiceConfig serviceConfig;

    public ServiceController(ServiceConfig serviceConfig) {
        this.serviceConfig = serviceConfig;
    }

    @GetMapping("/gservice/foo")
    public ResponseEntity<ServiceResponse> getSomething() {
        ServiceResponse serviceResponse = new ServiceResponse(serviceConfig.getServiceName(), serviceConfig.getPort(),
                serviceConfig.getVersion(), String.format("%s called at: %s", serviceConfig.getServiceName(),
                new Date().toString()), true);
        return new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}
