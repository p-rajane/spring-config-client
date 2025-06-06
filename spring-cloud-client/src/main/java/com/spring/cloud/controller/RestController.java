package com.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Value("${application.protocol}")
    private String applicationProtocol;

    @GetMapping("/get-config")
    public String getConfig() {
        return "Configuration property value: " + applicationProtocol;
    }
}
