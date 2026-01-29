package com.car.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public static ModelMapper getMapper(){
        return new ModelMapper();
    }
}
