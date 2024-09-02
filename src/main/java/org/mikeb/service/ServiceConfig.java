package org.mikeb.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties(prefix = "service")
public class ServiceConfig {
    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private int port;

    @Value("${service.version}")
    private String version;

    public String getServiceName() {
        return serviceName;
    }

    public int getPort() {
        return port;
    }

    public String getVersion() {
        return version;
    }
}
