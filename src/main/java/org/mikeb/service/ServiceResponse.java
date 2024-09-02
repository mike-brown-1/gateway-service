package org.mikeb.service;

public record ServiceResponse(String name, int port, String version, String message, Boolean successful) {}
