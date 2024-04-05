package com.praise.iDeal.Banking.App.infrastructure.config.cloudinaryConfig;

import com.cloudinary.Cloudinary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class CloudinaryConfig {
private final String CLOUD_NAME = "dawne9iy2";
private final String API_KEY = "682771819776765";
private final String CLOUDINARY_SECRET = "MPwuYQOlxx4PQmX1jcLwU343w7k";

@Bean
    public Cloudinary cloudinary(){
    Map<String, String> config = new HashMap<>();
    config.put("cloud_name", CLOUD_NAME);
    config.put("api_key", API_KEY);
    config.put("cloudinary_secret", CLOUDINARY_SECRET);

    return new Cloudinary(config);
}
    }
