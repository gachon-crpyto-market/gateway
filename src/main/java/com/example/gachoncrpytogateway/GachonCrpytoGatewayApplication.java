package com.example.gachoncrpytogateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GachonCrpytoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GachonCrpytoGatewayApplication.class, args);
    }
}
