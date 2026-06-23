package com.project.coinapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CoinController {

    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("service", "coin-price-api", "status", "running");
    }
}
